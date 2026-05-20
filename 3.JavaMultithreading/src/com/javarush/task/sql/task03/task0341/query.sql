-- Write your code here:
select *
from films
where films.title LIKE (
    select films.title
    from films
    where title LIKE 'The%r'
    LIMIT 1
    )
;