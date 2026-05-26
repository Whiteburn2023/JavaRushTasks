-- Write your code here:
SELECT object.name,
       YEAR(object.discovery_date) AS d_year,
       MONTHNAME(object.discovery_date) AS d_month,
       DAYNAME(object.discovery_date) AS d_day
FROM object
;