-- Write your code here:
select employee.department,
       employee.position,
       COUNT(*) AS total
from employee
where position = 'backend developer'
group by department, position
having total = 1
;
