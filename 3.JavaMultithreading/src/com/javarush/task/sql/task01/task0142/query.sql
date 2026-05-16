-- Write your code here:
select id,
       parts.identifier,
       parts.description
from parts
order by identifier DESC,
         required DESC,
         description ASC
;