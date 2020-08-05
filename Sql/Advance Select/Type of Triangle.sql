/*
Enter your query here.
Please append a semicolon ";" at the end of the query and enter your query in a single line to avoid error.
*/
SELECT 
case 
    when A+B>C AND A+C>B AND B+C>A THEN
    CASE
        when A=B AND B=C then 'Equilateral'
        when A=B or B=C or A=C then 'Isosceles'
        when A<>B and B<>C and C<>A then 'Scalene'
    END
    else 'Not A Triangle'
end
from triangles;

