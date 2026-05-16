-- Write your code here:
select cars.euro,
       case
           when IFNULL(cars.euro, 6) > 5
               then 'best'
           when IFNULL(cars.euro, 6) = 5
               then 'good'
           else 'bad'
           END
from cars
;