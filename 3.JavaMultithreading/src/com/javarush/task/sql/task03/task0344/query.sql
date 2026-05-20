-- Write your code here:
select films.title
from films
LEFT JOIN (
    select film_directors.id,
           film_directors.last_name
    from film_directors
    where film_directors.last_name = 'Spielberg'
) AS director ON director.id = films.director_id
;