-- Write your code here:
select retailers.name AS ret_name,
       sup.name AS sup_name,
       sup.country AS sup_country
from top_retailers AS retailers,
     suppliers AS sup
;