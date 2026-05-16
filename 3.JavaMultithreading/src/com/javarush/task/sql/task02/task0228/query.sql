-- Write your code here:
select employee.department,
       COUNT(*) AS number_of_employees
from employee
group by department
;