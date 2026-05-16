-- Write your code here:
select cars.name,
       COUNT(*) AS car_count
from cars
group by name
HAVING car_count < 3
;