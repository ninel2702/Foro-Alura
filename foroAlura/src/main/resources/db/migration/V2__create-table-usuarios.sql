CREATE TABLE usuarios (
    id BIGINT NOT NULL AUTO_INCREMENT,
    user VARCHAR(100) NOT NULL,
    contrasena VARCHAR(255) NOT NULL,

    PRIMARY KEY (id)
);