-- Write your code here:
SELECT authors.year_born
FROM authors
WHERE authors.year_born <= (SELECT MAX(date_released) FROM books)
;