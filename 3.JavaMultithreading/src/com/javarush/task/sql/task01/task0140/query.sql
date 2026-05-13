-- Write your code here:
select ip2country.ip_from, ip2country.ip_to, ip2country.country_name from ip2country
ORDER BY ip_to DESC
LIMIT 999999
OFFSET 74
;