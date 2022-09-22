use company;

create table Worker(WORKER_ID int not null,
FIRST_NAME varchar(50) not null,
LAST_NAME varchar(50) not null,
SALARY int not null,
JOINING_DATE varchar(50) not null,
DEPARTMENT varchar(50) not null);
desc worker;
drop table worker;


insert into Worker values
(001,"Monika","Arora","100000","2014-02-20 09:00:00","HR"),
(002,"Niharika","Verma","80000","2014-06-11 09:00:00","Admin"),
(003,"Vishal","Singhal","300000","2014-02-20 09:00:00","HR"),
(004,"Amitabh","Singh","500000","2014-02-20 09:00:00","Admin"),
(005,"Vivek","Bhati","500000","2014-06-11 09:00:00","Admin"),
(006,"Vipul","Diwan","200000","2014-06-11 09:00:00","Account"),
(007,"satish","Kumar","75000","2014-01-20 09:00:00","Account");

select first_name as Worker_Name from worker;

select upper(first_name) from worker;

select distinct department from worker;

select substring(first_name,1,3) from worker;

select INSTR(first_name,binary'a') from worker where first_name='Amitabh';

select RTRIM(first_name) from worker;

select LTRIM(first_name) from worker;

select distinct department,length(department) from worker;

select replace(first_name,'a','A') from worker;

select concat(first_name,' ',last_name) as complete_name from worker;

select * from worker order by first_name asc;

select * from worker order by first_name asc,department desc;

select * from worker where first_name in ('Vipul','satish');

select * from worker where first_name not in ('Vipul','satish');

select * from worker where department like 'admin';

select * from worker where first_name like '%a%';

select * from worker where first_name like '%a';

select * from worker where first_name like '______h';

select * from worker where salary between 100000 and 500000;

select * from worker where year(joining_date)=2014 and month(joining_date)=2;

select count(*) from worker where department='admin';

select concat(first_name,' ',last_name) as Worker_name,Salary
 from worker
 where Worker_id in
 (select worker_id from worker
 where salary between 50000 and 100000);

select department,count(worker_id) No_Of_Workers from worker 
group by(department) order by No_Of_Workers desc;

 

select * from worker where MOD(worker_id,2) <> 0;

select * from worker where MOD(worker_id,2) = 0;