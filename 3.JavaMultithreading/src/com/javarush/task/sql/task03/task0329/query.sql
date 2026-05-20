-- Write your code here:
select c.customer_id,
       o.order_status
from customers AS c JOIN orders AS o ON c.customer_id = o.customer_id
;