-- Write your code here:
select id, employee.name, employee.salary, employee.department from employee
where salary < 5000 AND salary > 2000
;