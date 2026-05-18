-- Write your code here:
select top_retailers.name AS retailer,
       top_retailers.hq_location AS retailer_hq,
       suppliers.country AS supplier_country
from top_retailers,
     suppliers
;