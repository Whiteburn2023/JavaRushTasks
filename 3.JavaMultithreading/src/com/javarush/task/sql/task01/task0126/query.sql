-- Write your code here:
select car.brand, car.model, car.quantity, car.booked_quantity from car
where brand IN ('renault', 'opel', 'seat', 'skoda')
   OR (quantity - booked_quantity) < 10
;