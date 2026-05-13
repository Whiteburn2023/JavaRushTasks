-- Write your code here:
select id, car.brand, car.model, car.quantity, car.booked_quantity from car
where brand IN ('mazda', 'toyota', 'nissan')
;