DELETE FROM t_user;

INSERT INTO t_user (id, username, password, role, youtube, instagram, vk, facebook) values
(1, 'admin1', '$2a$10$9hfeiv0KBATrneYXzypKnOFqP3ERuMNjeep9LiINyUsyoz53Gx5i.', 'ROLE_ADMINISTRATOR',
 'Perimited', 'Perimited', 'Perimited', 'Perimited'),
('2', 'user1', '$2a$10$Z6ZPAr6Dnacax8Caw5YWzuUf32amASXqQdX47IVovW7Cbp7obuj6m', 'ROLE_USER',
 'Denied', 'Denied', 'Denied', 'Denied'),
('3', 'user2', '$2a$10$SqiynBOo1OxX1u1VlHT/xO7wRvAXsNVG6U1pgbspja5DjGIKJm2Q6', 'ROLE_USER',
 'Denied', 'Denied', 'Denied', 'Denied'),
('4', 'user3', '$2a$10$D9hf81Mp0QHBgMtsmp8QvumTpO91lyPhInb5lnWoK3UqtYpHPS4gq', 'ROLE_USER',
 'Denied', 'Denied', 'Denied', 'Denied');