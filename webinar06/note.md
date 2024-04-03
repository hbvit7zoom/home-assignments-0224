docker run -e POSTGRES_PASSWORD=password -p 5433:5432 registry-ci.delta.sbrf.ru/base/docker.io/postgres:13.9-alpine

docker run -e POSTGRES_PASSWORD=password -p 5433:5432 postgres:13.9-alpine

-v /custom/mount:/var/lib/postgresql/data

CREATE TABLE public.author (
id bigint NOT NULL,
firstname varchar NULL,
lastname varchar NULL,
CONSTRAINT author_pk PRIMARY KEY (id)
);

INSERT INTO author
(id, firstname, lastname)
VALUES(1, 'Пушкин', 'Александр');
INSERT INTO author
(id, firstname, lastname)
VALUES(2, 'Толстой', 'Лев');
INSERT INTO author
(id, firstname, lastname)
VALUES(3, 'Лермонтов', 'Михаил');

docker ps - активные контейнеры
docker image ls - локальные образы

$ docker ps
CONTAINER ID  IMAGE                                                          COMMAND     CREATED        STATUS            PORTS                   NAMES
8ea2ba38d030  registry-ci.delta.sbrf.ru/base/docker.io/postgres:13.9-alpine  postgres    9 minutes ago  Up 9 minutes ago  0.0.0.0:5433->5432/tcp  silly_lovelace


docker rm silly_lovelace - удаляет контейнер
docker rm 8ea2ba38d030 - удаляет контейнер

docker rm 8ea2ba38d030 -f - принудительно удаляет контейнер