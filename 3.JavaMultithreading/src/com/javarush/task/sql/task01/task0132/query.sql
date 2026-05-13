-- Write your code here:
select ip2country.country_code, ip2country.ip_from, ip2country.ip_to from ip2country
LIMIT 9999999
OFFSET 78
;