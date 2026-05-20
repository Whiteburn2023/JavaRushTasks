-- Write your code here:
select retailer.name AS ret_name,
       retailer.hq_location AS ret_location,
       supplier.name AS sup_name

from top_retailers AS retailer,
     suppliers AS supplier
where retailer.annual_revenue_billions > 100
;