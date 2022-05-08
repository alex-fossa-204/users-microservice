--liquibase formatted sql

--changeset Bakulin:users_tables_constraints splitStatements:true endDelimiter:;

ALTER TABLE client
ADD CONSTRAINT role_roles_fk FOREIGN KEY (role)
REFERENCES role (id);

ALTER TABLE credential
ADD CONSTRAINT user_users_fk FOREIGN KEY (client)
REFERENCES client (id);

ALTER TABLE role_privilege
ADD CONSTRAINT privilege_privileges_fk FOREIGN KEY (privilege)
REFERENCES privilege (id);

ALTER TABLE role_privilege
ADD CONSTRAINT role_roles_fk FOREIGN KEY (role)
REFERENCES role (id);
