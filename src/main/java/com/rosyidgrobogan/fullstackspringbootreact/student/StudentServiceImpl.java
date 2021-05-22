package com.rosyidgrobogan.fullstackspringbootreact.student;

import com.rosyidgrobogan.fullstackspringbootreact.exception.ApiRequestException;
import com.rosyidgrobogan.fullstackspringbootreact.student.entity.StatusEnum;
import com.rosyidgrobogan.fullstackspringbootreact.student.entity.Student;
import com.rosyidgrobogan.fullstackspringbootreact.student.helpers.EmailValidator;
import com.rosyidgrobogan.fullstackspringbootreact.student.payload.StudentRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;
    private final EmailValidator emailValidator;

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository, EmailValidator emailValidator) {
        this.studentRepository = studentRepository;
        this.emailValidator = emailValidator;
    }


    @Override
    public void insert(StudentRequest request) {
        // TODO: Validate email
        // TODO Verify that email is not taken

        // Validate Email
        if (!emailValidator.test(request.getEmail())) {
            throw new ApiRequestException(request.getEmail() + " is not valid");
        }

        // isEmail Taken
        if (studentRepository.isEmailTaken(request.getEmail())) {
            throw new ApiRequestException(request.getEmail() + " is taken");
        }

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
