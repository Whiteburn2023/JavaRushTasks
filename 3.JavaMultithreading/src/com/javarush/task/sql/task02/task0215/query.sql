-- Write your code here:
select number_of_season,
       CASE
           WHEN number_of_season = 1
               then 'winter'
           WHEN number_of_season = 2
               then 'spring'
           when number_of_season = 3
               then 'summer'
           when number_of_season = 4
               then 'autumn'
           ELSE 'unknown'
           end
from months
;