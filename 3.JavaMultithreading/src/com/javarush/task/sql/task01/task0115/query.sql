-- Write your code here:
select id, employee.salary, employee.department, employee.name from employee
where salary < 5000 AND department = 'dev'
;