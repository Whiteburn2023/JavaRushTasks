-- Write your code here:
select customers.zip_code  AS cust_zip_code,
       orders.order_status AS status
from customers
         LEFT JOIN orders ON customers.customer_id = orders.customer_id
;