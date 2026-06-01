-- Write your code here:
/*
UPDATE employee
LEFT JOIN task ON employee.id = task.employee_id
        AND task.exp_date < '2022-10-01'
SET employee.salary = employee.salary + 1000
WHERE task.id IS NULL
;

 */


UPDATE employee
    SET employee.salary = employee.salary + 1000
WHERE employee.id IN (
    SELECT task.employee_id
    FROM task
    WHERE task.exp_date > '2022-10-01'
    )
;
