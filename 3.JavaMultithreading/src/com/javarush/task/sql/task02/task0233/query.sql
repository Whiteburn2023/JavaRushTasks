-- Write your code here:
select YEAR(employee.date_of_birth),
       COUNT(*)
from employee
group by YEAR(employee.date_of_birth)
;