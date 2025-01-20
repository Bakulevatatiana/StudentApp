--liquibase formatted sql


--changeset baku: 1
ALTER TABLE student

ADD COLUMN   course_number INTEGER;


