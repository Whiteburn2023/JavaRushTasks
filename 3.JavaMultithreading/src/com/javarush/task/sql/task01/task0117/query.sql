-- Write your code here:
select employee.department, employee.salary, employee.name from employee
where salary > 2200 AND NOT department = 'qa'
;