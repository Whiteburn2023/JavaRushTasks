-- Write your code here:
select *
from authors
where author_id NOT IN (select author_id
                        from books
                        where books.author_id IS NOT NULL
                          AND books.genre = 'novel')
;