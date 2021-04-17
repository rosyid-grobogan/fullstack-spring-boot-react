package com.rosyidgrobogan.fullstackspringbootreact.student;

import lombok.Data;

//import javax.persistence.Entity;
//import javax.persistence.Id;
import java.util.UUID;

//@Entity
@Data
public class Student {
//    @Id
    private final UUID studentId;
    private final String firstName;
    private final String lastName;
    private final String email;
    private final Gender gender;
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
