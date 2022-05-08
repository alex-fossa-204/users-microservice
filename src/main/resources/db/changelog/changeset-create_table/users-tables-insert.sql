--liquibase formatted sql

--changeset Bakulin:users_table_insert splitStatements:true endDelimiter:;

CREATE TABLE client
(
    id int PRIMARY KEY,
    firstname VARCHAR(64),
    lastname VARCHAR(64),
    date_of_birth timestamp,
    role integer,
    uid bigint
);

CREATE TABLE credential
(
    id int PRIMARY KEY,
    login VARCHAR(64),
    password VARCHAR(64),
    join_date timestamp,
    last_login_date timestamp,
    is_active boolean,
    is_non_locked boolean,
    client integer
);

CREATE TABLE privilege
(
    id int PRIMARY KEY,
    privilege VARCHAR(64)
);

CREATE TABLE role
(
    id int PRIMARY KEY,
    role_name VARCHAR(64)
);

CREATE TABLE role_privilege
(
    role integer,
    privilege integer
);