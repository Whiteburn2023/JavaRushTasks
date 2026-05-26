-- Write your code here:
SELECT
    YEAR(data.date),
    MONTH(data.date),
    DAY(data.date),
    SUM(total)
FROM data
GROUP BY YEAR(data.date),
         MONTH(data.date),
         DAY(data.date)
;