-- Write your code here:
SELECT
    employee.name,
    employee.position
FROM employee
WHERE DAYOFYEAR(date_of_birth) <= 200
;