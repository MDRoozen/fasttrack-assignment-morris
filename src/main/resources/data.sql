create table EMPLOYEE (
                          ID varchar(9) primary key,
                          NAME varchar(50)
);
create table HOLIDAY (
                         HOLIDAY_ID varchar(50) primary key,
                         HOLIDAY_LABEL varchar(50) not null,
                         EMPLOYEE_ID varchar(9) not null,
                         START_OF_HOLIDAY date,
                         END_OF_HOLIDAY date,
                         STATUS int not null
);

alter table HOLIDAY add constraint FK_EMPLOYEE foreign key (EMPLOYEE_ID) references EMPLOYEE(ID) on delete cascade;

insert into EMPLOYEE (ID, NAME) values ('klm012345', 'John Doe');
insert into EMPLOYEE (ID, NAME) values ('klm543210', 'Jane Doolittle');
insert into EMPLOYEE (ID, NAME) values ('klm202020', 'Katie-Lee Miller');

insert into HOLIDAY (HOLIDAY_ID, HOLIDAY_LABEL, EMPLOYEE_ID, STATUS) values ('230193', 'summer vacation', 'klm012345', 0);
insert into HOLIDAY (HOLIDAY_ID, HOLIDAY_LABEL, EMPLOYEE_ID, STATUS) values ('230194', 'fall vacation', 'klm543210', 1);
insert into HOLIDAY (HOLIDAY_ID, HOLIDAY_LABEL, EMPLOYEE_ID, STATUS) values ('230195', 'winter vacation', 'klm012345', 2);
