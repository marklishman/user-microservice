CREATE SCHEMA IF NOT EXISTS ref;

DROP TABLE IF EXISTS users;

CREATE TABLE users (
  user_id   serial primary key,
  full_name varchar(200) not null,
  user_name varchar(100) not null,
  email     varchar(500) not null,
  phone     varchar(100) not null,
  website   varchar(500)
);