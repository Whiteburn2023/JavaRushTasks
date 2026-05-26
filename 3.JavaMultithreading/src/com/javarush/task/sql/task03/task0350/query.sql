-- Write your code here:
WITH tempTable AS (
    SELECT AVG(films.grossed) AS averageGrossed
    FROM films
), tempTable2 AS (
    SELECT AVG(films.year_released) AS averageYearReleased
    FROM films
)
SELECT films.title,
       films.genre,
       films.year_released,
       films.grossed
      -- tempTable.averageGrossed,
      -- tempTable2.averageYearReleased
FROM films, tempTable, tempTable2
WHERE films.grossed > tempTable.averageGrossed
  AND films.year_released > tempTable2.averageYearReleased
GROUP BY films.year_released,
         films.title,
         films.genre,
         films.grossed
        -- tempTable.averageGrossed,
        -- tempTable2.averageYearReleased
;