-- Write your code here:
SELECT CONCAT(lego_set.number, ', ', lego_set.name) AS full_name
FROM lego_set
ORDER BY LENGTH(name) ASC
;