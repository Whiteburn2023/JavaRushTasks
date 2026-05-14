-- Write your code here:
select parts.required, parts.identifier, parts.description from parts
where description IS NOT NULL
;