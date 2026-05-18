-- Write your code here:
select cars.name,
       AVG(cars.price),
       SUM(cars.price)
from cars
group by name
having AVG(price) > 100000
;