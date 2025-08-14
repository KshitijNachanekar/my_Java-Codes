CREATE DATABASE IF NOT EXISTS garage_jdbc;

USE garage_jdbc;

CREATE TABLE vehicles (
    vehicle_id INT PRIMARY KEY,
    owner_name VARCHAR(100),
    vehicle_model VARCHAR(100),
    license_plate VARCHAR(50) UNIQUE,
    service_status VARCHAR(50)
);
