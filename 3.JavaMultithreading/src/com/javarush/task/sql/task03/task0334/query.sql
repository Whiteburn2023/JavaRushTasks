-- Write your code here:
select author.last_name AS author,
       author.country   AS author_country,
       book.genre       AS book_genre
from authors AS author LEFT JOIN books AS book ON author.author_id = book.author_id
where book.genre = 'fantasy'
group by author.last_name, author.country, book.genre
order by  author_country ASC
LIMIT 5
;