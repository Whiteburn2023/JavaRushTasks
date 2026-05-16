-- Write your code here:
select employee.department AS department_name,
       COUNT(*) AS count
from employee
where position = 'frontend developer' OR position = 'backend developer'
group by department
;