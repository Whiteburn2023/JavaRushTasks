-- Write your code here:
select YEAR(employee.date_of_birth) AS year_of_birth,
       COUNT(*)
from employee
where position LIKE '%developer%'
group by YEAR(employee.date_of_birth)
;