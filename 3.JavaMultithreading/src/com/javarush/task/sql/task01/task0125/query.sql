-- Write your code here:
select car.brand, car.model, car.booked_quantity from car
where model NOT LIKE '%ea%'
;