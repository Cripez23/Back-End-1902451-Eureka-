INSERT INTO usuarios (username, password, enabled, nombre, apellido, email) VALUES ('Cris', '12345', 1, 'Cristopher', 'Perez', 'cris_yoo23@hotmail.com');
INSERT INTO usuarios (username, password, enabled, nombre, apellido, email) VALUES ('Emma', '12345', 1, 'Emmanuel', 'Baltasar', 'Emma23@hotmail.com');

INSERT INTO roles (nombre) VALUES ('ROLE_USER');
INSERT INTO roles (nombre) VALUES ('ROLE_ADMIN');

INSERT INTO usuarios_to_roles (user_id, rooles_id) VALUES (1, 2);
INSERT INTO usuarios_to_roles (user_id, rooles_id) VALUES (2, 2);
INSERT INTO usuarios_to_roles (user_id, rooles_id) VALUES (2, 1);
