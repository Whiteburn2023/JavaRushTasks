-- Write your code here:
select ip2country.country_code, ip2country.ip_from, ip2country.ip_to from ip2country
where country_code = 'DE'
LIMIT 5
OFFSET 3
;