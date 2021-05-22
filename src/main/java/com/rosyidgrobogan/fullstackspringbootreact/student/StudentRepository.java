package com.rosyidgrobogan.fullstackspringbootreact.student;
import com.rosyidgrobogan.fullstackspringbootreact.student.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, String> {
}
