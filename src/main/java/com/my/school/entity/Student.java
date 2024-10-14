package com.my.school.entity;

import com.my.school.constant.Gender;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @Id
    @Column(nullable = false, unique = true, length = 6)
    private String student_no;

    @Column(length = 10)
    private String name;

    @Column(length = 15)
    private String phone;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Column(length = 20)
    private String address;

    @OneToOne
    @JoinColumn(name = "exam_no")
    private Exam exam;
}
