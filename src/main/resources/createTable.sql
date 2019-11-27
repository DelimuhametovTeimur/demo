CREATE TABLE t_user(
    id INTEGER(11) AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(25) not null unique,
    password varchar(60) not null,
    role varchar(20) not null,
    youtube varchar(10) not null,
    instagram varchar(10) not null,
    vk varchar(10) not null,
    facebook varchar(10) not null
);

