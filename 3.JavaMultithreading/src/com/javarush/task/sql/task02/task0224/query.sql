-- Write your code here:
select employee.department, COUNT(*)
from employee
where position = 'backend developer'
group by department
;
