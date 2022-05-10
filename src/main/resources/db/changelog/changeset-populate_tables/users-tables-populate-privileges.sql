--liquibase formatted sql

--changeset Bakulin:privileges_insert splitStatements:true endDelimiter:;

INSERT INTO privilege (privilege)
VALUES
('user:read'),
('user:delete'),
('user:update'),
('user:create');