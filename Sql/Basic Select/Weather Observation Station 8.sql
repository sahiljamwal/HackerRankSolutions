/*
Enter your query here.
Please append a semicolon ";" at the end of the query and enter your query in a single line to avoid error.
*/

SELECT DISTINCT CITY 
FROM STATION 
WHERE substr(city,1,1) in ('A','E','I','O','U') and substr(city,-1) in ('a','e','i','o','u');
