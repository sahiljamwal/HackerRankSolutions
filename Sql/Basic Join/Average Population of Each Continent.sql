select country.continent,floor(avg(city.population))
from country inner join city on city.countryCode=country.code group by country.continent;

