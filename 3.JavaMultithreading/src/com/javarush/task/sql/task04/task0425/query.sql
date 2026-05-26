-- Write your code here:
SELECT
    YEAR(employee.date_of_birth),
    MONTH(employee.date_of_birth),
    COUNT(*)
FROM employee
GROUP BY YEAR(employee.date_of_birth), MONTH(employee.date_of_birth)
;