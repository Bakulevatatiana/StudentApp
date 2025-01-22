--liquibase formatted sql
--changeset bakuleva:1
CREATE TABLE group_student
(   id      BIGSERIAL           PRIMARY KEY,
    group_name  VARCHAR(60)  NOT NULL,
    departments VARCHAR(250) NOT NULL,
    enrollment  INT     NOT NULL
);
--changeset bakuleva:2
CREATE TABLE student
(   id            BIGSERIAL           PRIMARY KEY,
    sur_name      VARCHAR(60)  NOT NULL,
    name          VARCHAR(60)  NOT NULL,
    patronymic    VARCHAR(20) NOT NULL,
    group_student  VARCHAR(100) NOT NULL,
    date_of_birth VARCHAR(100) NOT NULL,
    gender        VARCHAR(20) NOT NULL,
    student_status VARCHAR(60) NOT NULL
);
--changeset bakuleva:3
ALTER TABLE student
    ADD COLUMN   course_number INTEGER;
--changeset bakuleva:4
CREATE TABLE group_student
(   id      BIGSERIAL           PRIMARY KEY,
    group_name  VARCHAR(60)  NOT NULL,
    departments VARCHAR(250) NOT NULL,
    enrollment  INT     NOT NULL
);

