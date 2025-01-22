--liquibase formatted sql
--changeset bakuleva:5
CREATE TABLE groupp
(   id      BIGSERIAL           PRIMARY KEY,
    group_name  VARCHAR(60)  NOT NULL,
    departments VARCHAR(250) NOT NULL,
    enrollment  INT     NOT NULL
);
--changeset bakuleva:6
CREATE TABLE studentt
(   id            BIGSERIAL           PRIMARY KEY,
    sur_name      VARCHAR(60)  NOT NULL,
    name          VARCHAR(60)  NOT NULL,
    patronymic    VARCHAR(20) NOT NULL,
    group_student  VARCHAR(100) NOT NULL,
    date_of_birth VARCHAR(100) NOT NULL,
    gender        VARCHAR(20) NOT NULL,
    student_status VARCHAR(60) NOT NULL
);
