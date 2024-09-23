select p.name, c.name
from person as p
left join company as c
on p.company_id = c.id
where p.company_id != 5 or p.company_id is null;


select c.name, count(p.name)
from company as c
join person as p
on c.id = p.company_id
group by c.name
having count(p.name) = (
	select max(person_count)
	from (
		select count(company_id) as person_count
		from person
		group by company_id
	)
);
