-- Write your code here:
select name AS car_name,
       COUNT(*) AS car_count
from cars
group by name
;