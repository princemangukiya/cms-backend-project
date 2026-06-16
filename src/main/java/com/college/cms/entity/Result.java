package com.college.cms.entity;

import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonProperty; // Yeh import add karein

@Entity
@Table(name = "result_detail")
public class Result {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long result_id;

    @JsonProperty("grade")
    private String grade;

    @JsonProperty("status")
    private String status;

    @JsonProperty("totalMarks") // Frontend ke "totalMarks" ko map karega
    @Column(name = "total_marks")
    private Integer total_marks;

    @JsonProperty("student")
    @ManyToOne
    @JoinColumn(name = "student_id", nullable = false)
    private Student student;

    @JsonProperty("subject")
    @ManyToOne
    @JoinColumn(name = "subject_id", nullable = false)
    private Subject subject;

    public Result() {}

    // --- Getters ---
    public Long getResult_id() { return result_id; }
    public String getGrade() { return grade; }
    public String getStatus() { return status; }
    public Integer getTotal_marks() { return total_marks; }
    public Student getStudent() { return student; }
    public Subject getSubject() { return subject; }

    // --- Setters ---
    public void setResult_id(Long result_id) { this.result_id = result_id; }
    public void setGrade(String grade) { this.grade = grade; }
    public void setStatus(String status) { this.status = status; }
    public void setTotal_marks(Integer total_marks) { this.total_marks = total_marks; }
    public void setStudent(Student student) { this.student = student; }
    public void setSubject(Subject subject) { this.subject = subject; }
}