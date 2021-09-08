create table DRINKS (
    ID                    bigserial primary key,
    TITLE                 varchar(30) not null,
    VOLUME                int not null,
    COFFEE                int not null,
    WATER                 int not null,
    MILK                  int not null
);

create table BREWED (
    BREWED_AT             timestamp without time zone primary key NOT NULL,
    DRINK_ID              int not null,
    foreign key (DRINK_ID) references DRINKS (ID)

);

insert into DRINKS (TITLE, VOLUME, COFFEE, WATER, MILK )
values ('Espresso', 30, 30, 0, 0),
       ('Cappuccino', 100, 30, 20, 40),
       ('Americano', 100, 30, 70, 0),
       ('Late', 100, 30, 0, 70);