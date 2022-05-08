--liquibase formatted sql

--changeset Bakulin:roles_insert splitStatements:true endDelimiter:;

INSERT INTO role VALUES (1, 'USER');
INSERT INTO role VALUES (2, 'ADMIN');