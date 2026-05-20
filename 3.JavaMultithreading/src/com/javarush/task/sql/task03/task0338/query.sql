-- Write your code here:
select *
from authors
where authors.full_name NOT LIKE (
    SELECT CONCAT(first_name, ' ', last_name)
    from authors
    where last_name = 'Shakespeare'
    )
;

-- LIKE — это оператор сравнения строк, а подзапрос возвращает набор строк