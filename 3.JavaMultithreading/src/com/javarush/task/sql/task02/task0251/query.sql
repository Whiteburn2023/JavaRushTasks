-- Write your code here:
select employee.department,
       employee.position,
       COUNT(*) AS total
from employee
group by department, position
having total = 1 OR position = 'manager'
LIMIT 2
offset 1
;