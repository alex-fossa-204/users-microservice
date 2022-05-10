--liquibase formatted sql

--changeset Bakulin:privileges_insert splitStatements:true endDelimiter:;

INSERT INTO privilege OVERRIDING SYSTEM VALUE VALUES (1, 'user:read');
INSERT INTO privilege OVERRIDING SYSTEM VALUE VALUES (2, 'user:delete');
INSERT INTO privilege OVERRIDING SYSTEM VALUE VALUES (3, 'user:update');
INSERT INTO privilege OVERRIDING SYSTEM VALUE VALUES (4, 'user:create');