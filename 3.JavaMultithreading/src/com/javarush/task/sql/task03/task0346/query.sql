-- Write your code here:
select *
from films
JOIN (select film_directors.id, film_directors.year_born
    from film_directors
    where year_born < 1940
    ) As director ON director.id = films.director_id
where genre = 'sci-fi'
;