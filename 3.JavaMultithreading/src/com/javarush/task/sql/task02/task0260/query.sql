-- Write your code here:
select employee.rating,
       GROUP_CONCAT(employee.name)
from employee
-- where rating > 2
group by employee.rating
HAVING rating > 2
order by rating ASC
;