-- Write your code here:
select *
from gyms,
     customers
where gyms.location = 'London'
  AND customers.location = 'London'
;