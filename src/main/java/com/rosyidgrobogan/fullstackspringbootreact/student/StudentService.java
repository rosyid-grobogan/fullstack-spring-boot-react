package com.rosyidgrobogan.fullstackspringbootreact.student;

import com.rosyidgrobogan.fullstackspringbootreact.student.entity.Student;
import com.rosyidgrobogan.fullstackspringbootreact.student.payload.StudentRequest;
import com.rosyidgrobogan.fullstackspringbootreact.student.payload.StudentResponse;

import java.util.List;

public interface StudentService {

    void insert(StudentRequest request);

    List<Student> getAll();
}
