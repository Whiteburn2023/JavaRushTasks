-- Write your code here:
select employee.department, employee.salary, employee.name from employee
where salary < 1000 OR salary >= 5000
;