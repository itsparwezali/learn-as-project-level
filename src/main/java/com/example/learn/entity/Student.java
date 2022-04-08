package com.example.learn.entity;

import com.example.learn.entity.abstractEntity.AbstractEntity;
import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "student")
public class Student extends AbstractEntity{

    @Column(name = "email")
    private String email;

    @Column(name = "mobile_number")
    private String mobileNumber;

    @Column(name = "student_name")
    private String studentName;

    @Column(name = "faculty")
    private String faculty;

    @Column(name = "address")
    private String address;


}
