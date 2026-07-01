package com.college.cms.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "feedback_detail")
public class Feedback {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "feedback_id")
    private Integer feedbackId;

    @Column(name = "feedback_from")
    private Integer feedbackFrom;

    @Column(name = "feedback_to")
    private Integer feedbackTo;

    @Column(name = "rating")
    private Integer rating;

    @Column(name = "feedback_message")
    private String feedbackMessage;

    public Feedback() {
    }

    public Integer getFeedbackId() {
        return feedbackId;
    }

    public void setFeedbackId(Integer feedbackId) {
        this.feedbackId = feedbackId;
    }

    public Integer getFeedbackFrom() {
        return feedbackFrom;
    }

    public void setFeedbackFrom(Integer feedbackFrom) {
        this.feedbackFrom = feedbackFrom;
    }

    public Integer getFeedbackTo() {
        return feedbackTo;
    }

    public void setFeedbackTo(Integer feedbackTo) {
        this.feedbackTo = feedbackTo;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public String getFeedbackMessage() {
        return feedbackMessage;
    }

    public void setFeedbackMessage(String feedbackMessage) {
        this.feedbackMessage = feedbackMessage;
    }
}