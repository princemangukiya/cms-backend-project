package com.college.cms.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "exam_detail")
@Data
public class Exam {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long exam_id;

    private Integer course_id;
    private String exam_type;
    private LocalDate exam_start_date;
    private LocalDate exam_end_date;
    private LocalTime exam_time;
    private Integer subject_id;
}