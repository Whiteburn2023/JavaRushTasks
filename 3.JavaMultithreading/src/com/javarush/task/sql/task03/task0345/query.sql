-- Write your code here:
select film_directors.last_name
from film_directors
LEFT JOIN (
         select films.director_id,
         films.grossed
         from films
         where grossed > 100
) AS film
         ON film_directors.id = film.director_id
where film_directors.country = 'UK'
;


