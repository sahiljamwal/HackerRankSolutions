select sum(city.population)
from city inner join country on city.CountryCode=country.code and country.continent='Asia';
