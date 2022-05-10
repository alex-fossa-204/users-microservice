--liquibase formatted sql

--changeset Bakulin:roles_privileges_insert splitStatements:true endDelimiter:;

INSERT INTO role_privilege (role, privilege)
VALUES
(1, 1),
(1, 4),
(2, 1),
(2, 2),
(2, 3),
(2, 4),
(1, 3);