-- Write your code here:
select developers.experience,
    CASE
        when experience < 1
            then 'junior'
        when experience < 3
            then 'middle'
        when experience < 5
            then 'senior'
    END
from developers
;