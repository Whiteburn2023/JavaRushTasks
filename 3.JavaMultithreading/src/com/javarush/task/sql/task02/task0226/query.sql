-- Write your code here:
select name, COUNT(*)
from cars
where prod_year = 2021
group by name
;