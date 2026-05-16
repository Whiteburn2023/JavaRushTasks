-- Write your code here:
select YEAR(cars.prod_date) AS prod_year,
       MONTH(cars.prod_date) AS prod_month,
       COUNT(*)
from cars
where name = 'Black Car'
  AND price > 99000
group by prod_year, prod_month
;