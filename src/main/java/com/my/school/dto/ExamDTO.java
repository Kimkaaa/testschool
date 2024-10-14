package com.my.school.dto;

import com.my.school.entity.Exam;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExamDTO {
    private String exam_no;
    private int kor;
    private int math;
    private int eng;
    private int hist;

    // Entity -> DTO
    public static ExamDTO fromEntity(Exam exam) {
        return new ExamDTO(
                exam.getExam_no(),
                exam.getKor(),
                exam.getMath(),
                exam.getEng(),
                exam.getHist()
        );
    }

    // DTO -> Entity
    public static Exam fromDTO(ExamDTO dto) {
        return new Exam(
                dto.getExam_no(),
                dto.getKor(),
                dto.getMath(),
                dto.getEng(),
                dto.getHist()
        );
    }
}
