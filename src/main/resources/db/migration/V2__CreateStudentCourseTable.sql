CREATE TABLE IF NOT EXISTS courses (
    course_id VARCHAR (255) NOT NULL PRIMARY KEY,
    name VARCHAR (255) NOT NULL UNIQUE,
    description TEXT NOT NULL,
    department VARCHAR (255),
    teacher_name VARCHAR (100)
);

CREATE TABLE IF NOT EXISTS student_course (
    student_id VARCHAR (255) NOT NULL REFERENCES students (student_id),
    course_id VARCHAR (255) NOT NULL REFERENCES courses (course_id),
    start_date DATE NOT NULL,
    end_date DATE NOT NULL,
    grade INTEGER CHECK (
        grade >= 0 AND grade <= 100
    ),
    UNIQUE (student_id, course_id)
);