-- Write your code here:
select id, car.brand, car.model, car.quantity, car.booked_quantity from car
where (quantity - booked_quantity) BETWEEN 10 AND 100
;