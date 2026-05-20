-- Write your code here:
select a.last_name AS author,
       b.title AS book_title,
       b.copies_sold_millions AS books_sold
from authors AS a RIGHT JOIN books AS b ON  a.author_id = b.author_id
where b.copies_sold_millions > 50
;
