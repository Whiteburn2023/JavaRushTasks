-- Write your code here:
select *
from customers
         JOIN orders ON customers.customer_id = orders.customer_id
where orders.total_cost > 100
;