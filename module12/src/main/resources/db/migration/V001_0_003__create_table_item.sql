create table item
(
    id        varchar(255) not null,
    price_rub float(53),
    article   varchar(255),
    name      varchar(255),
    order_id  varchar(255),
    primary key (id)
)