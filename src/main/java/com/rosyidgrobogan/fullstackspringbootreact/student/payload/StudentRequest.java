package com.rosyidgrobogan.fullstackspringbootreact.student.payload;

import com.rosyidgrobogan.fullstackspringbootreact.student.entity.GenderEnum;
import com.rosyidgrobogan.fullstackspringbootreact.student.entity.Student;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class StudentRequest {

    @NotBlank
    private String firstName;

    @NotBlank
    private String lastName;

    @Email
    private String email;

    @NotNull
    private GenderEnum gender;

//    @NotNull
//    private final Student.Status status;
}
