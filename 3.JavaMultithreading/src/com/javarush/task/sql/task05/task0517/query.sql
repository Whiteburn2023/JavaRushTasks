-- Write your code here:
SELECT lego_set.released,
       COUNT(*)
FROM lego_set
GROUP BY released
;