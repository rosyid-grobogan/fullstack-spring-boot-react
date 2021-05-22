CREATE TYPE gender AS ENUM ('MALE', 'FEMALE');

ALTER TABLE students
ALTER COLUMN gender TYPE gender
USING (gender::gender)