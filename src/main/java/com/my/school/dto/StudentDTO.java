package com.my.school.dto;

import com.my.school.constant.Gender;
import com.my.school.entity.Exam;
import com.my.school.entity.Student;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Locale;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentDTO {
    private String student_no;
    private String name;
    private String phone;
    private Gender gender;
    private String address;
    private Exam exam;

    // Entity -> DTO
    public static StudentDTO fromEntity(Student student){
        return new StudentDTO(
                student.getStudent_no(),
                student.getName(),
                student.getPhone(),
                student.getGender(),
                student.getAddress(),
                student.getExam()
        );
    }
    // DTO -> Entity
    public static Student fromDTO(StudentDTO dto){
        return new Student(
                dto.getStudent_no(),
                dto.getName(),
                dto.getPhone(),
                dto.getGender(),
                dto.getAddress(),
                dto.getExam()
        );
    }
}
