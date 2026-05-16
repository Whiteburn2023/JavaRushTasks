-- Write your code here:
select CASE
           WHEN YEAR(employee.date_of_birth) < 2000
               then 'yes'
           ELSE 'no'
           END AS experienced,
    MONTH(employee.date_of_birth) AS month_of_birth
from employee
;

