-- Write your code here:
select ret.hq_location AS ret_location,
       sup.annual_revenue_billions AS sup_revenue
from top_retailers AS ret,
     suppliers AS sup
where ret.hq_location != 'USA'
;