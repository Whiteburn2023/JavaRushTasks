-- Write your code here:
WITH tempTable AS (
    SELECT AVG(film_directors.year_born) AS averageDOB
    FROM film_directors
)
SELECT film_directors.id,
       film_directors.full_name,
       film_directors.year_born,
       tempTable.averageDOB
FROM film_directors
    JOIN tempTable
WHERE film_directors.year_born < tempTable.averageDOB
;


-- или CROSS JOIN или запятая