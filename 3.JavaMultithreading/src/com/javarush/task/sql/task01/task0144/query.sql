-- Write your code here:
select parts.description from parts
order by required DESC, identifier DESC, description DESC
LIMIT 9999999
OFFSET 23
;