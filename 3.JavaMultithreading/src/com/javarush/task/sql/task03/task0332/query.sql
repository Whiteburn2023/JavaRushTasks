-- Write your code here:
select auth.last_name AS author,
       book.genre       AS book_genre,
       book.date_released
from authors AS auth
         RIGHT JOIN books AS book ON auth.author_id = book.author_id
where book.date_released < 1900
group by auth.last_name, book.genre, book.date_released
;


-- в 5. не указан authors.last_name AS author  для группировки