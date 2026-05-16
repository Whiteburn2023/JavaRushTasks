-- Write your code here:
select position, employee.department,
       COUNT(*)
from employee
group by position, department
;