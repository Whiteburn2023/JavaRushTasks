-- Write your code here:
select a.sex                  AS author_sex,
       a.country              AS author_country,
       b.copies_sold_millions AS books_sold
from authors AS a
         JOIN books AS b ON a.author_id = b.author_id
where b.copies_sold_millions > 10
group by a.sex, a.country, b.copies_sold_millions
order by b.copies_sold_millions DESC
;