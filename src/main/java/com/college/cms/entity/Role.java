package com.college.cms.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "role_detail")
public class Role {

    @Id
    @Column(name = "role_id") // DB column name
    private Long role_id;

    @Column(name = "role_name") // DB column name
    private String role_name;
}