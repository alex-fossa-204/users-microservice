--liquibase formatted sql

--changeset Bakulin:privileges_insert splitStatements:true endDelimiter:;

INSERT INTO privilege VALUES (1, 'user:read');
INSERT INTO privilege VALUES (2, 'user:delete');
INSERT INTO privilege VALUES (3, 'user:update');
INSERT INTO privilege VALUES (4, 'user:create');