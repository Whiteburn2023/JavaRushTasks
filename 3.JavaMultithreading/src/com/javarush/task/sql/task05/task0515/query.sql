-- Write your code here:
SELECT part.name
FROM part
WHERE name LIKE '%Slope%'
          AND name NOT LIKE '%45°%'
;