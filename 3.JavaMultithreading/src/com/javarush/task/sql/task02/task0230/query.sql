-- Write your code here:
select employee.department AS department_name,
       COUNT(*) as count
from employee
where position = 'frontend developer'
group by department
;