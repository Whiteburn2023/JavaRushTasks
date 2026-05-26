-- Write your code here:
SELECT DISTINCT publisher.name
FROM publisher
    JOIN book ON publisher.id = book.publisher_id
    JOIN author ON book.author_id = author.id
WHERE author.full_name = 'Mark Twain'
;