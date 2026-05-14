-- Write your code here:
select id, parts.identifier, parts.description from parts
order by identifier ASC, required DESC, description DESC
LIMIT 7
;