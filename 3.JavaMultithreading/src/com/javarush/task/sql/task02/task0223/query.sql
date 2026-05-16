-- Write your code here:
select employee.department, COUNT(*)
from employee
group by department
;