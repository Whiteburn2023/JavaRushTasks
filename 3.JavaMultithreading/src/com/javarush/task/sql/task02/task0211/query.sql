-- Write your code here:
select IF(customers.age <= 12, 'child', IF(customers.age >= 20, 'adult', 'teenager'))
from customers
LIMIT 5
;