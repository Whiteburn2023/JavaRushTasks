-- Write your code here:
select YEAR(employee.date_of_birth),
       MONTH(employee.date_of_birth)
from employee
group by YEAR(employee.date_of_birth), MONTH(employee.date_of_birth)
;