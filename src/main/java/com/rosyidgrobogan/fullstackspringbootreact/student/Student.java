package com.rosyidgrobogan.fullstackspringbootreact.student;

import lombok.Data;

//import javax.persistence.Entity;
//import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.UUID;

//@Entity
@Data
public class Student {
//    @Id
    private final UUID studentId;

    @NotBlank
    private final String firstName;

    @NotBlank
    private final String lastName;

    @Email
    private final String email;

    @NotNull
    private final Gender gender;

    @NotNull
    private final Status status;

    enum Gender {
        MALE,
        FEMALE
    }

    enum Status {
        ACTIVED,
        UNACTIVED
    }
}
