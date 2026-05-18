-- Write your code here:
select cars.name,
       SUM(cars.price)
from cars
group by name
;