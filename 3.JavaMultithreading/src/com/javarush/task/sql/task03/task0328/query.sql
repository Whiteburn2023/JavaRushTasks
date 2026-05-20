-- Write your code here:
select customers.phone AS cust_phone,
       orders.order_date,
       orders.total_cost,
       orders.store_id
from customers
         RIGHT JOIN orders ON customers.customer_id = orders.customer_id
where customers.city = 'New York'
  AND orders.order_status = 'PROCESSING'
;