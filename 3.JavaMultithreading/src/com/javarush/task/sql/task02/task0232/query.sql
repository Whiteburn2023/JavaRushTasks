-- Write your code here:


-- is_full_time - int , а задание = 'no' 'yes'
-- 1 - yes, 0 - no

select
    count(CASE WHEN students.is_full_time = 1 THEN 1 END) AS yes,
    count(CASE WHEN students.is_full_time = 0 THEN 1 END) AS no
from students
;
