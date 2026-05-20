-- Write your code here:
select *
from authors
where author_id NOT IN (
    SELECT author_id
    FROM books
    WHERE title = 'War and Peace'
    AND books.author_id = 7)
;

