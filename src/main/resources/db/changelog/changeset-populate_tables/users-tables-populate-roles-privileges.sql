--liquibase formatted sql

--changeset Bakulin:roles_privileges_insert splitStatements:true endDelimiter:;

INSERT INTO role_privilege VALUES (1, 1);
INSERT INTO role_privilege VALUES (1, 4);
INSERT INTO role_privilege VALUES (2, 1);
INSERT INTO role_privilege VALUES (2, 2);
INSERT INTO role_privilege VALUES (2, 3);
INSERT INTO role_privilege VALUES (2, 4);
INSERT INTO role_privilege VALUES (1, 3);