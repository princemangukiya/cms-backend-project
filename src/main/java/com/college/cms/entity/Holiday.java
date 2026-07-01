package com.college.cms.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "holiday_detail")
public class Holiday {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "holiday_id")
    private Integer holidayId;

    @Column(name = "holiday_date", nullable = false)
    private LocalDate holidayDate;

    @Column(name = "holiday_name", nullable = false)
    private String holidayName;

    public Holiday() {
    }

    public Holiday(Integer holidayId, LocalDate holidayDate, String holidayName) {
        this.holidayId = holidayId;
        this.holidayDate = holidayDate;
        this.holidayName = holidayName;
    }

    public Integer getHolidayId() {
        return holidayId;
    }

    public void setHolidayId(Integer holidayId) {
        this.holidayId = holidayId;
    }

    public LocalDate getHolidayDate() {
        return holidayDate;
    }

    public void setHolidayDate(LocalDate holidayDate) {
        this.holidayDate = holidayDate;
    }

    public String getHolidayName() {
        return holidayName;
    }

    public void setHolidayName(String holidayName) {
        this.holidayName = holidayName;
    }
}