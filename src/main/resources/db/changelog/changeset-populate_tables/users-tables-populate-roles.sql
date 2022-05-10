--liquibase formatted sql

--changeset Bakulin:roles_insert splitStatements:true endDelimiter:;

INSERT INTO role (role_name)
VALUES
('USER'),
('ADMIN');