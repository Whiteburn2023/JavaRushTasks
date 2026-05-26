-- Write your code here:
SELECT lego_set.released,
       COUNT(*) AS total
FROM lego_set
GROUP BY released
ORDER BY COUNT(*) DESC
;