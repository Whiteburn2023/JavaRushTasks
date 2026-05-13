-- Write your code here:
select id, employee.name, employee.salary, employee.department from employee
where salary BETWEEN 1000 AND 5000
;