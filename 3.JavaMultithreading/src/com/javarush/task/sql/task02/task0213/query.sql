-- Write your code here:
select students.is_full_time,
       CASE
           when is_full_time = 1
               then 'true'
           when is_full_time = 0
               then 'false'
           else ''
        END
from students
;