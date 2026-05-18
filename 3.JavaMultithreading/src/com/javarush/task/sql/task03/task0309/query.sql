-- Write your code here:
select gym.location,
       person.location
from gyms AS gym,
     customers AS person
where person.location != 'London'
group by gym.location, person.location
;