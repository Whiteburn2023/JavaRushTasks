-- Write your code here:
CREATE TABLE cars
(
    id          INT AUTO_INCREMENT PRIMARY KEY,
    brand       VARCHAR(255) NOT NULL,
    model       VARCHAR(255) NOT NULL,
    year        INT          NOT NULL,
    engine      VARCHAR(255) NOT NULL,
    consumption FLOAT
);
INSERT INTO cars (id, brand, model, "year", engine, consumption)
VALUES (1, 'Lexus', 'IS', 2017, 'petrol', 7.5),
       (2, 'Volvo', 'XC90', 2019, 'diesel', 8.5),
       (3, 'Volkswagen', 'Golf', 2020, 'petrol', 8),
       (4, 'Toyota', 'Corolla', 2015, 'petrol', 10),
       (5, 'BMW', '5', 2005, 'petrol', 15.5),
       (6, 'Ford', 'Transit', 2010, 'diesel', 9);