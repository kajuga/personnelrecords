CREATE DATABASE personnelrecords;

DROP TABLE personnelrecords.employee;
DROP TABLE personnelrecords.project;
DROP TABLE personnelrecords.team;
DROP TABLE personnelrecords.feedback;


CREATE TABLE personnelrecords.feedback
(
    id SERIAL NOT NULL CONSTRAINT feedback_id PRIMARY KEY,
    description text,
    creation_date date NOT NULL DEFAULT now()
);

CREATE TABLE personnelrecords.team
(
    id SERIAL NOT NULL CONSTRAINT team_id PRIMARY KEY,
    title VARCHAR (150) NOT NULL
);

CREATE TABLE personnelrecords.project
(
    id SERIAL NOT NULL CONSTRAINT project_id PRIMARY KEY,
    name VARCHAR (150) NOT NULL,
    client VARCHAR (150) NOT NULL,
    duration VARCHAR (150) NOT NULL,
    methodology VARCHAR (150) NOT NULL,
    project_manager VARCHAR (150) NOT NULL,
    team_id INTEGER REFERENCES personnelrecords.team(id) NOT NULL
);

CREATE TABLE personnelrecords.employee
(
    id SERIAL NOT NULL CONSTRAINT employee_id PRIMARY KEY,
    first_name VARCHAR (150) NOT NULL,
    last_name VARCHAR (150) NOT NULL,
    phone_number VARCHAR (50) NOT NULL,
    email VARCHAR (50) default 'none',
    skype VARCHAR (150) default 'none',
    entry_date date NOT NULL,
    experience VARCHAR (150) NOT NULL,
    experience_level VARCHAR (150) NOT NULL,
    language_level VARCHAR (150) NOT NULL,
    birthday date NOT NULL,
    project_id INTEGER references personnelrecords.project(id) NOT NULL,
    feedback_id INTEGER references personnelrecords.feedback(id) ON DELETE CASCADE
   );
