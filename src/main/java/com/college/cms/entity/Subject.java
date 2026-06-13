package com.college.cms.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "subject_detail")
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long subject_id;

    private String subjectName;
    private String subjectCode;
    private Integer subjectCredit;
    private String subjectType;
    private Integer courseId;
    private Integer examId;

    // Default constructor is required by JPA
    public Subject() {}

    // --- Getters and Setters ---

    public Long getSubject_id() { return subject_id; }
    public void setSubject_id(Long subject_id) { this.subject_id = subject_id; }

    public String getSubjectName() { return subjectName; }
    public void setSubjectName(String subjectName) { this.subjectName = subjectName; }

    public String getSubjectCode() { return subjectCode; }
    public void setSubjectCode(String subjectCode) { this.subjectCode = subjectCode; }

    public Integer getSubjectCredit() { return subjectCredit; }
    public void setSubjectCredit(Integer subjectCredit) { this.subjectCredit = subjectCredit; }

    public String getSubjectType() { return subjectType; }
    public void setSubjectType(String subjectType) { this.subjectType = subjectType; }

    public Integer getCourseId() { return courseId; }
    public void setCourseId(Integer courseId) { this.courseId = courseId; }

    public Integer getExamId() { return examId; }
    public void setExamId(Integer examId) { this.examId = examId; }
}