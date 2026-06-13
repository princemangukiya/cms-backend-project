package com.college.cms.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "result_detail")
public class Result {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long result_id;

    private String grade;
    private String status;
    private Integer total_marks;

    @ManyToOne
    @JoinColumn(name = "student_id", nullable = false)
    private Student student;

    @ManyToOne
    @JoinColumn(name = "subject_id", nullable = false)
    private Subject subject;

    // Default Constructor (JPA ke liye zaroori hai)
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