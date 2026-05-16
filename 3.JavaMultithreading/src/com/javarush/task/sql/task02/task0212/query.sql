-- Write your code here:
select IF(employee.position = 'manager',
          if(employee.salary > 10000, 'good', 'bad'),
          if(employee.salary > 5000, 'good', 'bad'))
from employee
where city = 'London'
;