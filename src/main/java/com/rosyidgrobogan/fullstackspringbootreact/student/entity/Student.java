package com.rosyidgrobogan.fullstackspringbootreact.student.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Data
@Table(name = "students")
public class Student {

    @Id
    private String studentId;

    private String firstName;

    private String lastName;

    private String email;

    @Enumerated(EnumType.STRING)
    @Column(length = 6)
    private GenderEnum gender;

    @Enumerated(EnumType.STRING)
    @Column(length = 9)
    private StatusEnum status;

}
