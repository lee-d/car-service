package de.edeka.springandmockexample.customer;

import java.util.StringJoiner;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Customer {

  @Id
  private Long id;
  private String name;
  private String customerNumber;
  @Enumerated(EnumType.STRING)
  private CustomerType type;

  public Customer() {
  }

  public Customer(long id, String name, String customerNumber, CustomerType type) {
    this.id = id;
    this.name = name;
    this.customerNumber = customerNumber;
    this.type = type;
  }

  public Long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getCustomerNumber() {
    return customerNumber;
  }

  public CustomerType getType() {
    return type;
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", Customer.class.getSimpleName() + "[", "]")
        .add("id=" + id)
        .add("name='" + name + "'")
        .add("customerNumber='" + customerNumber + "'")
        .add("type=" + type)
        .toString();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }

    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Customer customer = (Customer) o;

    return new org.apache.commons.lang3.builder.EqualsBuilder()
        .append(id, customer.id)
        .append(name, customer.name)
        .append(customerNumber, customer.customerNumber)
        .append(type, customer.type)
        .isEquals();
  }

  @Override
  public int hashCode() {
    return new org.apache.commons.lang3.builder.HashCodeBuilder(17, 37)
        .append(id)
        .append(name)
        .append(customerNumber)
        .append(type)
        .toHashCode();
  }
}
