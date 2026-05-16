-- Write your code here:
select cars.euro,
       IF(euro IS NULL, 'good', 'bad')
from cars
;