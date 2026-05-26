-- Write your code here:
SELECT
    employee.name,
    employee.position
FROM employee
WHERE DAYNAME(date_of_birth) = 'Monday'
;