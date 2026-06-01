-- Write your code here:
INSERT INTO sale_addresses (street, city, state, zip_code, country)
SELECT customers.street,
       customers.city,
       customers.state,
       customers.zip_code,
       customers.country
FROM customers
WHERE customers.country != '%Testostan%'
;