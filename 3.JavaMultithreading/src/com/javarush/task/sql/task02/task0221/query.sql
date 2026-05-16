-- Write your code here:
select cars.prod_year, COUNT(*)
from cars
group by cars.prod_year
;