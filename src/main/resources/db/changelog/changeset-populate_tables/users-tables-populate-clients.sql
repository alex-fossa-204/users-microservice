--liquibase formatted sql

--changeset Bakulin:clients_insert splitStatements:true endDelimiter:;

INSERT INTO client (firstname, lastname, date_of_birth, role, uid)
VALUES
('Alexander', 'Ivanov', '1996-03-11 00:00:00', 1, 786784177),
('Roman', 'Maksimov', '1996-02-22 00:00:00', 1, 786786787),
('Alexey', 'Petrovsky', '1996-04-11 00:00:00', 1, 786786877),
('Alexey', 'Bakulin', '1996-07-24 00:00:00', 2, 786486841);