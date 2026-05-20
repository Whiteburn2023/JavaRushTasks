-- Write your code here:
WITH grossed_total AS (
    select SUM(films.grossed) AS total
    from films
)
SELECT AVG(grossed_total.total) AS average_grossed
from grossed_total
;

-- total сумма, как от одного значения искать среднее?