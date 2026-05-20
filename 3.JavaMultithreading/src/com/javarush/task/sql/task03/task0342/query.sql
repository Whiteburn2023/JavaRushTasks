-- Write your code here:
SELECT *
from film_directors
where full_name LIKE (
    select CONCAT(first_name, ' ', last_name)
    from film_directors
    LIMIT 1
    )
;