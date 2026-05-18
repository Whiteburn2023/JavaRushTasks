-- Write your code here:
select employee.rating,
       GROUP_CONCAT(employee.name)
from employee
where rating > 2
group by employee.rating
order by rating ASC
;