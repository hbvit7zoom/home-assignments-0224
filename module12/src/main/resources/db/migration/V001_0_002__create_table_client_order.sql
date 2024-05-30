create table client_order
(
    id                varchar(255) not null,
    created_date_time timestamp(6),
    client_id         varchar(255),
    primary key (id)
)