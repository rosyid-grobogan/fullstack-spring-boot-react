package com.rosyidgrobogan.fullstackspringbootreact.student;

import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("students")
public class StudentController {

    @GetMapping
    public List<Student> getAllStudents() {
        throw new IllegalArgumentException("Oops cannot get all students");
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
