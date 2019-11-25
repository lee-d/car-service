package de.edeka.springandmockexample.config;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories("de.edeka")
public class DatabaseConfig {

	private final String url;
	private final String userName;
	private final String password;
	private final int maxPoolSize;

	public DatabaseConfig(@Value("${datasource.url}") String url,
			@Value("${datasource.username}") String userName,
			@Value("${datasource.password}") String password,
			@Value("${datasource.maxpoolsize}") int maxPoolSize) {
		this.url = url;
		this.userName = userName;
		this.password = password;
		this.maxPoolSize = maxPoolSize;
	}

	@Bean
	@ConfigurationProperties(prefix = "spring.datasource")
	public HikariDataSource dataSource() {
			HikariDataSource dataSourceBuilder = DataSourceBuilder.create().type(HikariDataSource.class).build();
			dataSourceBuilder.setJdbcUrl(url);
			dataSourceBuilder.setUsername(userName);
			dataSourceBuilder.setPassword(password);
			dataSourceBuilder.setMaximumPoolSize(maxPoolSize);
		return dataSourceBuilder;
	}
}
