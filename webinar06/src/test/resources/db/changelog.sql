-- changeset Vitalii:1
CREATE TABLE public.author (
id bigint NOT NULL,
firstname varchar NULL,
lastname varchar NULL,
CONSTRAINT author_pk PRIMARY KEY (id)
);
---- changeset Vitalii:2
--CREATE TABLE public.author (
--id bigint NOT NULL,
--firstname varchar NULL,
--lastname varchar NULL,
--CONSTRAINT author_pk PRIMARY KEY (id)
--);
