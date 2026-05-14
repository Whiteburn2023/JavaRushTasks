-- Write your code here:
select id, parts.identifier, parts.description, parts.required from parts
order by required DESC , id ASC
;