-- Write your code here:
select retailer.ret_name,
       retailer.ret_revenue,
       supplier.sup_name,
       supplier.sup_revenue
from top_retailers AS retailer
    JOIN suppliers AS supplier ON retailer.ret_revenue = supplier.sup_revenue
where supplier.sup_revenue > 50
;