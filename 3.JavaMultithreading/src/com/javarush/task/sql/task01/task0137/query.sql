-- Write your code here:
select DISTINCT ip2country.country_name from ip2country
where country_name NOT LIKE '% %'
;