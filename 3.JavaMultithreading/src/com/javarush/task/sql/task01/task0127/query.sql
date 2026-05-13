-- Write your code here:
select id, car.brand, car.model, car.quantity, car.booked_quantity from car
where model NOT LIKE '%a%'
  AND (quantity - booked_quantity) BETWEEN 5 AND 500
;