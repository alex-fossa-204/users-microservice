--liquibase formatted sql

--changeset Bakulin:clients_insert splitStatements:true endDelimiter:;

INSERT INTO client VALUES (2, 'Alexander', 'Ivanov', '1996-03-11 00:00:00', 1, 786784177);
INSERT INTO client VALUES (3, 'Roman', 'Maksimov', '1996-02-22 00:00:00', 1, 786786787);
INSERT INTO client VALUES (4, 'Alexey', 'Petrovsky', '1996-04-11 00:00:00', 1, 786786877);
INSERT INTO client VALUES (1, 'Alexey', 'Bakulin', '1996-07-24 00:00:00', 2, 786486841);