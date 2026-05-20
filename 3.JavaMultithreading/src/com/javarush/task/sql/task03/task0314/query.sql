-- Write your code here:
select ret.name AS ret_name,
       ret.annual_revenue_billions AS ret_revenue,
       supplier.name AS sup_name
from top_retailers AS ret,
     suppliers AS supplier
;