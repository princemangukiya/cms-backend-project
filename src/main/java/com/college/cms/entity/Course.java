package com.college.cms.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity
@Table(name = "course_management")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "course_id")
    @JsonProperty("course_id")
    private Integer courseId;

    @Column(name = "course_name")
    @JsonProperty("course_name")
    private String courseName;

    @Column(name = "semester")
    @JsonProperty("semester")
    private String semester;

    @Column(name = "course_fee")
    @JsonProperty("course_fee")
    private Double courseFee;

    public Course() {}

    // Getters and Setters
    public Integer getCourseId() { return courseId; }
    public void setCourseId(Integer courseId) { this.courseId = courseId; }
    public String getCourseName() { return courseName; }
    public void setCourseName(String courseName) { this.courseName = courseName; }
    public String getSemester() { return semester; }
    public void setSemester(String semester) { this.semester = semester; }
    public Double getCourseFee() { return courseFee; }
    public void setCourseFee(Double courseFee) { this.courseFee = courseFee; }
}