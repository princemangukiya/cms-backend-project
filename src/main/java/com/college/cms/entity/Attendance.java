package com.college.cms.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "attendance")
public class Attendance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long attendanceid;

    // Frontend se 'yyyy-MM-dd' format mein date aayegi
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate attendancedate;

    // Frontend se 'HH:mm' format mein time aayega
    @JsonFormat(pattern = "HH:mm")
    private LocalTime intime;

    @JsonFormat(pattern = "HH:mm")
    private LocalTime outtime;

    private Integer userid;

    // Default Constructor
    public Attendance() {}

    // Getters and Setters
    public Long getAttendanceid() { return attendanceid; }
    public void setAttendanceid(Long attendanceid) { this.attendanceid = attendanceid; }

    public LocalDate getAttendancedate() { return attendancedate; }
    public void setAttendancedate(LocalDate attendancedate) { this.attendancedate = attendancedate; }

    public LocalTime getIntime() { return intime; }
    public void setIntime(LocalTime intime) { this.intime = intime; }

    public LocalTime getOuttime() { return outtime; }
    public void setOuttime(LocalTime outtime) { this.outtime = outtime; }

    public Integer getUserid() { return userid; }
    public void setUserid(Integer userid) { this.userid = userid; }
}