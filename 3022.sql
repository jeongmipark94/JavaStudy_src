select * from DIARY;

select rownum, r, num, subject, writer, E_YEAR||'-'||E_MONTH||'-'||E_DAY evtday, W_DATE
from diary
from (select num, subject, writer, E_YEAR||'-'||E_MONTH||'-'||E_DAY evtday, W_DATE from diary order by W_date desc)
order by W_DATE desc;

select r, num,subject,writer,e_year,e_month,e_day,w_date
 from ( select rownum r, num,subject,writer,e_year,e_month,e_day,w_date
 	from(select num,subject,writer,e_year,e_month,e_day,w_date from diary order by num desc))
 where r between 1 and 10;

 select r, num,subject,writer,evtday,w_date
 from ( select rownum r, num,subject,writer,evtday,w_date
 	from(select num,subject,writer,E_YEAR||'-'||E_MONTH||'-'||E_DAY evtday,w_date from diary order by num desc))
 where r between 1 and 10;
