-- Write your code here:
SELECT author.full_name,
       COUNT(publisher.name)
FROM author
    LEFT JOIN book ON author.id = book.author_id
    LEFT JOIN publisher ON book.publisher_id = publisher.id
GROUP BY author.full_name
;