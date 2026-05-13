-- Write your code here:
select id, ip2country.country_code, ip2country.country_name, ip2country.ip_from, ip2country.ip_to from ip2country
LIMIT 7
OFFSET 62
;