-- Write your code here:
select *
from film_directors
RIGHT JOIN (select films.director_id,
                   films.title
            from films
            where year_released > 1990
            ) AS film ON film.director_id = film_directors.id
where film_directors.country = 'USA'
LIMIT 5
;