-- Write your code here:
select id,
       IF(salary <= 500, 1000, 0)
from employee
where id > 5
LIMIT 10
;