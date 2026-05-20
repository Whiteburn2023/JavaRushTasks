-- Write your code here:
select employee.department,
       employee.position,
       COUNT(*) AS total
from employee
-- where position = 'frontend developer'
group by employee.department, employee.position
having total > 1 AND position = 'frontend developer'
LIMIT 1
;