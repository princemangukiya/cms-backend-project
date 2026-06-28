package com.college.cms.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "class_management")
public class ClassMgmt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long class_id;

    private String class_name;
    private Integer course_id;
    private String building_no;
    private String floor_no;
    private String room_no;

    // Getters and Setters
    public Long getClass_id() { return class_id; }
    public void setClass_id(Long class_id) { this.class_id = class_id; }
    public String getClass_name() { return class_name; }
    public void setClass_name(String class_name) { this.class_name = class_name; }
    public Integer getCourse_id() { return course_id; }
    public void setCourse_id(Integer course_id) { this.course_id = course_id; }
    public String getBuilding_no() { return building_no; }
    public void setBuilding_no(String building_no) { this.building_no = building_no; }
    public String getFloor_no() { return floor_no; }
    public void setFloor_no(String floor_no) { this.floor_no = floor_no; }
    public String getRoom_no() { return room_no; }
    public void setRoom_no(String room_no) { this.room_no = room_no; }
}