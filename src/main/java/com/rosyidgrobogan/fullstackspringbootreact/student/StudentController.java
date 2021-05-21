package com.rosyidgrobogan.fullstackspringbootreact.student;

import com.rosyidgrobogan.fullstackspringbootreact.exception.ApiRequestException;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("students")
public class StudentController {

    @GetMapping
    public List<Student> getAllStudents() {
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

    @PostMapping
    public void addNewStudent(@RequestBody Student student) {
        System.out.println(student);
    }

}
