-- Write your code here:
select id, parts.identifier, parts.description, parts.required from parts
where id BETWEEN 7 AND 23
  AND identifier IS NULL
order by id ASC
LIMIT 2
;