-- Write your code here:
SELECT author.full_name,
       COUNT(*) AS books
FROM author JOIN book ON author.id = book.author_id
GROUP BY author.full_name
HAVING COUNT(*) > 1
;