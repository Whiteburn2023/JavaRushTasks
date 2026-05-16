-- Write your code here:
select YEAR(employee.date_of_birth),
       MONTH(employee.date_of_birth)
from employee
where MONTH(date_of_birth) IN (12, 1, 2)
;