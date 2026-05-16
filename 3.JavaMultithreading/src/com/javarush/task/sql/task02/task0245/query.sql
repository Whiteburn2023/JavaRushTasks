-- Write your code here:
select cars.name,
       COUNT(*)
from cars
group by name
HAVING COUNT(*) > 1
;