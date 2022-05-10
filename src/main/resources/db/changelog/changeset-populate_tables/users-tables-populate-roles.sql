--liquibase formatted sql

--changeset Bakulin:roles_insert splitStatements:true endDelimiter:;

INSERT INTO role OVERRIDING SYSTEM VALUE VALUES (1, 'USER');
INSERT INTO role OVERRIDING SYSTEM VALUE VALUES (2, 'ADMIN');