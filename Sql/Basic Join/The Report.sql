/*
Enter your query here.
Please append a semicolon ";" at the end of the query and enter your query in a single line to avoid error.
*/
select 
case
    when m.grade>7 then s.name
    else null
end
,m.grade,s.marks 
from students s inner join grades m on (s.marks between m.min_mark and m.max_mark)
order by m.grade desc,s.name asc,s.marks asc;
