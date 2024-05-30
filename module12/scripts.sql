Hibernate: drop table if exists client cascade
Hibernate: drop table if exists item cascade
Hibernate: drop table if exists client_order cascade
Hibernate: create table client (first_name varchar(255), id varchar(255) not null, last_name varchar(255), primary key (id))
Hibernate: create table client_order (created_date_time timestamp(6), client_id varchar(255), id varchar(255) not null, primary key (id))
Hibernate: create table item (price_rub float(53), article varchar(255), id varchar(255) not null, name varchar(255), order_id varchar(255), primary key (id))
Hibernate: alter table if exists client_order add constraint FKcggjtc9f3otuprl7takbttwuk foreign key (client_id) references client
Hibernate: alter table if exists item add constraint FKqupdtu795q3tl1s4rgppvlqhy foreign key (order_id) references client_order