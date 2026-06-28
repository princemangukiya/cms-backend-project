package com.college.cms.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "feedbackdetail")
@Data
public class Feedback {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer feedbackid;
    private String feedback_to;
    private String feedback_from;
    private Integer feedback_rating;
    private String feedback_message;
}