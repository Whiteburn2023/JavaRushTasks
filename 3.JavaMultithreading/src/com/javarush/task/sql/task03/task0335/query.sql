-- Write your code here:
select author.country AS author_country,
       COUNT(book.book_id) AS book_count
from authors AS author JOIN books AS book ON author.author_id = book.author_id
where book.genre = 'novel'
group by author.country
HAVING book_count > 2
;
