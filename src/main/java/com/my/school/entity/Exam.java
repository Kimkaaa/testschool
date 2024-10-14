package com.my.school.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Exam {
    @Id
    @Column(name = "exam_no", nullable = false, unique = true, length = 6)
    private String exam_no;

    @Column(length = 10)
    private int kor;
    @Column(length = 15)
    private int math;
    @Column(length = 4)
    private int eng;
    @Column(length = 20)
    private int hist;
}
