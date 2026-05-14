-- Write your code here:
select id, parts.identifier, parts.description, parts.required from parts
where description IS NOT NULL OR identifier IS NULL
;