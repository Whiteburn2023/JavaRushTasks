-- Write your code here:
select cars.prod_year, COUNT(*)
from cars
where name = 'Blue Car'
group by prod_year
;