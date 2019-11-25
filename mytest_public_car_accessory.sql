create table car_accessory
(
	id bigserial not null
		constraint car_accessory_pk
			primary key,
	name text,
	price numeric(10,2),
	manufacturer text
);

alter table car_accessory owner to car-service;

INSERT INTO public.car_accessory (id, name, price, manufacturer) VALUES (1, 'Frontscheibe', 200.50, 'BMW');
INSERT INTO public.car_accessory (id, name, price, manufacturer) VALUES (2, 'Frontscheibe', 189.50, 'AUDI');
INSERT INTO public.car_accessory (id, name, price, manufacturer) VALUES (3, 'Winterreife', 300.00, 'BMW');
INSERT INTO public.car_accessory (id, name, price, manufacturer) VALUES (4, 'Winterreife', 400.00, 'AUDI');
INSERT INTO public.car_accessory (id, name, price, manufacturer) VALUES (5, 'Winterreife', 345.90, 'MERCEDES');
INSERT INTO public.car_accessory (id, name, price, manufacturer) VALUES (6, 'Kühlmittel', 100.00, 'MERCEDES');
INSERT INTO public.car_accessory (id, name, price, manufacturer) VALUES (7, 'Kühlmittel', 125.50, 'AUDI');
INSERT INTO public.car_accessory (id, name, price, manufacturer) VALUES (8, 'Scheibenwischer', 25.45, 'AUDI');
INSERT INTO public.car_accessory (id, name, price, manufacturer) VALUES (9, 'Scheibenwischer', 20.00, 'MERCEDES');
INSERT INTO public.car_accessory (id, name, price, manufacturer) VALUES (10, 'Scheibenwischer', 36.78, 'BMW');
INSERT INTO public.car_accessory (id, name, price, manufacturer) VALUES (11, 'Glühbirne', 15.50, 'BMW');
INSERT INTO public.car_accessory (id, name, price, manufacturer) VALUES (12, 'Glühbirne', 21.30, 'MERCEDES');
INSERT INTO public.car_accessory (id, name, price, manufacturer) VALUES (13, 'Glühbirne', 18.99, 'AUDI');
