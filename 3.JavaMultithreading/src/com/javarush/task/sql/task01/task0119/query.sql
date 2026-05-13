-- Write your code here:
select id, employee.name, employee.salary, employee.department from employee
where department = 'qa' OR department = 'dev'
;