package com.rosyidgrobogan.fullstackspringbootreact.student;

import com.rosyidgrobogan.fullstackspringbootreact.exception.ApiRequestException;
import com.rosyidgrobogan.fullstackspringbootreact.student.entity.Student;
import com.rosyidgrobogan.fullstackspringbootreact.student.payload.StudentRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("students")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getAllStudents() {
        try {
            return studentService.getAll();
        } catch (RuntimeException e) {
            throw new ApiRequestException(e.getMessage());
        }
    }

    @PostMapping
    public void addNewStudent(@RequestBody @Valid StudentRequest request) {
        try {
            studentService.insert(request);
            System.out.println("REQUEST" + request);
        }catch (RuntimeException e) {
            throw new ApiRequestException(e.getMessage());
        }

    }

    @GetMapping("/data")
    public List<Student> getData() {
        throw new ApiRequestException("Oops cannot get all students");
//        throw new IllegalStateException("Oops cannot get all students with custom exception");
//        return List.of(
//                new Student(
//                        UUID.randomUUID(),
//                        "Rosyid",
//                        "Grobogan",
//                        "rosyid@test.com",
//                        Student.Gender.MALE,
//                        Student.Status.ACTIVED),
//
//                new Student(
//                        UUID.randomUUID(),
//                        "Elisa",
//                        "Tamara",
//                        "putri@test.com",
//                        Student.Gender.FEMALE,
//                        Student.Status.UNACTIVED)
//        );
    }

}
