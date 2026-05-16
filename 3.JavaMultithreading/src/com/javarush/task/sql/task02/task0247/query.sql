-- Write your code here:
select employee.department,
       employee.position,
       COUNT(*) AS total
From employee
group by department, position
having total = 1
;