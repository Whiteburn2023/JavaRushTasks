-- Write your code here:
select * from car
where (quantity - booked_quantity) BETWEEN 10 AND 100
;