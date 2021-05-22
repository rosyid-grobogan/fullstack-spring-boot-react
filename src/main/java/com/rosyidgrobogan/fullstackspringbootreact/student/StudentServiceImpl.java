package com.rosyidgrobogan.fullstackspringbootreact.student;

import com.rosyidgrobogan.fullstackspringbootreact.student.entity.StatusEnum;
import com.rosyidgrobogan.fullstackspringbootreact.student.entity.Student;
import com.rosyidgrobogan.fullstackspringbootreact.student.payload.StudentRequest;
import com.rosyidgrobogan.fullstackspringbootreact.student.payload.StudentResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    @Override
    public void insert(StudentRequest request) {

        Student student = new Student();

        student.setStudentId(UUID.randomUUID().toString());
        student.setFirstName(request.getFirstName());
        student.setLastName(request.getLastName());
        student.setEmail(request.getEmail());
        student.setGender(request.getGender());
        student.setStatus(StatusEnum.ACTIVED);

        studentRepository.save(student);

    }

    @Override
    public List<Student> getAll() {
            return studentRepository.findAll();


    }
}
