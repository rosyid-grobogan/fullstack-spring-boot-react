-- ALTER USER root WITH PASSWORD 'root';

CREATE TABLE IF NOT EXISTS student (
    student_id UUID PRIMARY KEY NOT NULL,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    email VARCHAR(50) NOT NULL UNIQUE,
    gender VARCHAR(6) NOT NULL
        CHECK (
            gender = 'MALE' OR
            gender = 'male' OR
            gender = 'FEMALE' OR
            gender = 'female'
        ),
    status VARCHAR (7) NOT NULL
          CHECK (
            status = 'ACTIVED' OR
            status = 'actived' OR
            status = 'UNACTIVED' OR
            status = 'unactived'
          )

);