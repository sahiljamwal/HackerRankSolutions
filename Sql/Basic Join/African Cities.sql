select city.name
from city inner join country on city.CountryCode=country.code and country.continent='Africa';
