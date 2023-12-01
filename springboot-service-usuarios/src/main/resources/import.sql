INSERT INTO usuarios (username, password, enabled, nombre, apellido, email) VALUES ('Cris', '$2a$10$x/sxFznYExKRuggKFCriguWbC5L0dbGTMLzhNF4C.Lu0XZH9BeUaW', 1, 'Cristopher', 'Perez', 'cris_yoo23@hotmail.com')
INSERT INTO usuarios (username, password, enabled, nombre, apellido, email) VALUES ('Emma', '$2a$10$w0dAfbq7ji4ZL0z1.ARciuUc7fHesJoIJZW4D84z0gU1c/KcEvvx2', 1, 'Emmanuel', 'Baltasar', 'Emma23@hotmail.com');

INSERT INTO roles (nombre) VALUES ('ROLE_USER');
INSERT INTO roles (nombre) VALUES ('ROLE_ADMIN');

INSERT INTO usuarios_to_roles (user_id, rooles_id) VALUES (1, 2);
INSERT INTO usuarios_to_roles (user_id, rooles_id) VALUES (2, 2);
INSERT INTO usuarios_to_roles (user_id, rooles_id) VALUES (2, 1);
