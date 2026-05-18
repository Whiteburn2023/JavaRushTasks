-- Write your code here:
select cars.name,
       MIN(cars.price),
       MAX(cars.price)
from cars
group by name
having MAX(price) < 200000
;