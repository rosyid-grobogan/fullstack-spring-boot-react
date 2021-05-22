package com.rosyidgrobogan.fullstackspringbootreact.student;
import com.rosyidgrobogan.fullstackspringbootreact.student.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, String> {

    @Query(value = "SELECT EXISTS(SELECT 1 FROM students WHERE email= :email) ", nativeQuery = true)
    Boolean isEmailTaken(@Param("email") String email);
}
