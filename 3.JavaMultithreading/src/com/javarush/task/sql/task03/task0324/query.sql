-- Write your code here:
select c.customer_id,
       o.order_id
from customers AS c
         LEFT JOIN orders AS o ON c.customer_id = o.customer_id
where o.shipped_date IS NULL
;