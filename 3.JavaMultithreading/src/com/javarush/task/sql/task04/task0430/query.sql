-- Write your code here:
SELECT
    YEAR(event.date_time),
    MONTH(event.date_time),
    DAY(event.date_time),
    COUNT(*)
FROM event
GROUP BY YEAR(event.date_time), MONTH(event.date_time), DAY(event.date_time)
HAVING COUNT(*) > 5
;

