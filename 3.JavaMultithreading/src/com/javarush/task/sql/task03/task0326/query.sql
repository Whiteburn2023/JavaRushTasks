-- Write your code here:
select customers.email,
       orders.*
from customers
         RIGHT JOIN orders ON customers.customer_id = orders.customer_id
;