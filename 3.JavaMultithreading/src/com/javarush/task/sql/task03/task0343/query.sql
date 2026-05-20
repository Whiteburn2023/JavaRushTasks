-- Write your code here:
select film_directors.full_name
from film_directors
LEFT JOIN (
         select films.director_id, films.title
         from films
         where films.genre = 'comedy')
    AS f ON film_directors.id = f.director_id
;


