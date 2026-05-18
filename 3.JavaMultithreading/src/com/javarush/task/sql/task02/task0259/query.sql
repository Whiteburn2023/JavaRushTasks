-- Write your code here:
select employee.position,
       GROUP_CONCAT(employee.name)
from employee
group by position
having position LIKE '%developer%'
;