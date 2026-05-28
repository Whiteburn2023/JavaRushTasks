-- Write your code here:
UPDATE employee
SET employee.salary = employee.salary + 1000
WHERE NOT EXISTS(
    SELECT 1
    FROM task
    WHERE task.employee_id = employee.id
        AND task.exp_date < '2022-10-01'
);