
drop database Lab304;

create database Lab304; -- crea base de datos

use Lab304; -- usamos base de datos

drop table if exists customer, aircraft, flight;

CREATE TABLE customer (
  `id` INT NOT NULL AUTO_INCREMENT,
  `customer_name` VARCHAR(255) NOT NULL,
  `customer_status` VARCHAR (255) NOT NULL,
  `flight_number` VARCHAR(255) NOT NULL references flight(flight_number_id),
  `total_customer_milage` INT NOT NULL,
  PRIMARY KEY (`id`)
  );
  
CREATE TABLE aircraft (
  `aircraft` VARCHAR(255) UNIQUE NOT NULL references flight(aircraft_id),
  `aircraft_seats` INT NOT NULL,
  primary key (`aircraft`)
);

CREATE TABLE flight (
  `flight_number_id` VARCHAR(255) UNIQUE NOT NULL,
  `aircraft_id` VARCHAR(255),
  `flight_milage` INT NOT NULL,
  PRIMARY KEY (`flight_number_id`)
  );
  
insert into customer (customer_name, customer_status, flight_number, total_customer_milage) values 
('Agustine Riviera','Silver','DL143', 115235),
('Agustine Riviera','Silver','DL122', 115235),
('Alaina Sepulvida','None','DL122', 6008), 
('Agustine Riviera','Silver','DL143', 115235), 
('Tom Jones','Gold','DL122', 205767), 
('Tom Jones','Gold','DL53', 205767), 
('Agustine Riviera','Silver','DL143', 115235),
('Sam Rio', 'None', 'DL143', 2653), 
('Agustine Riviera','Silver','DL143', 115235), 
('Tom Jones','Gold','DL222',205767), 
('Jessica James', 'Silver','DL143', 127656), 
('Sam Rio', 'None', 'DL143', 2653),
('Ana Janco','Silver','DL222', 136773), 
('Jennifer Cortez','Gold','DL222', 300582), 
('Jessica James', 'Silver','DL122', 127656),
('Sam Rio', 'None', 'DL37', 2653), 
('Christian Janco','Silver','DL222', 14642);

insert into aircraft (aircraft, aircraft_seats) values
('Boeing 747', 400),
('Airbus A330',236),
('Boeing 777',264);

 
insert into flight (flight_number_id, aircraft_id, flight_milage) values 
('DL143', 'Boeing 747', 135), 
('DL122', 'Airbus A330', 4370), 
('DL53', 'Boeing 777', 2078), 
('DL222', 'Boeing 777', 1765), 
('DL37', 'Boeing 747', 531);

use lab304;