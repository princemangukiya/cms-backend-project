package com.college.cms.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "book_issue_detail")
public class BookIssue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "issue_id")
    private Long issueId;

    // Foreign Keys ke liye mapping
    @Column(name = "book_id")
    private Long bookId;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "issue_date")
    private LocalDate issueDate;

    private Double fine;
    private String reason;

    // Getters and Setters
    public Long getIssueId() { return issueId; }
    public void setIssueId(Long issueId) { this.issueId = issueId; }
    public Long getBookId() { return bookId; }
    public void setBookId(Long bookId) { this.bookId = bookId; }
    public Long getUserId() { return userId; }
    public void setUserId(Long userId) { this.userId = userId; }
    public LocalDate getIssueDate() { return issueDate; }
    public void setIssueDate(LocalDate issueDate) { this.issueDate = issueDate; }
    public Double getFine() { return fine; }
    public void setFine(Double fine) { this.fine = fine; }
    public String getReason() { return reason; }
    public void setReason(String reason) { this.reason = reason; }
}