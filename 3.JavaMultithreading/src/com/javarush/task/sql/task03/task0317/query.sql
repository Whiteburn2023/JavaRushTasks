-- Write your code here:
select *
from top_retailers
    JOIN suppliers ON top_retailers.ret_location = suppliers.sup_country
;
