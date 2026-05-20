-- Write your code here:
select *
from authors
where author_id IN (select author_id
                    from books
                    where genre = 'fantasy')
;