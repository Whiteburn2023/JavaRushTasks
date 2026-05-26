-- Write your code here:
SELECT lego_set.number,
       CEIL(lego_set.inventory * 1.01) AS with_spare_parts
FROM lego_set
;
