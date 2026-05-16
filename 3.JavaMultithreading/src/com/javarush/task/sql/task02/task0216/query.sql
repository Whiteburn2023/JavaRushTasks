-- Write your code here:
select employee.position,
       case
           when position = 'backend developer'
               then 'yes'
           when position = 'frontend developer'
               then 'yes'
           ELSE 'no'
           end
from employee
where department = 'cool devs'
;