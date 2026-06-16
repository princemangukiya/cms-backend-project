package com.college.cms.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "library_detail")
public class Library {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookid;

    private String bookname;
    private String authorname;
    private String booklanguage;
    private Integer totalbook;
    private Double bookprice;

    public Library() {}

    // Getters and Setters
    public Long getBookid() { return bookid; }
    public void setBookid(Long bookid) { this.bookid = bookid; }
    public String getBookname() { return bookname; }
    public void setBookname(String bookname) { this.bookname = bookname; }
    public String getAuthorname() { return authorname; }
    public void setAuthorname(String authorname) { this.authorname = authorname; }
    public String getBooklanguage() { return booklanguage; }
    public void setBooklanguage(String booklanguage) { this.booklanguage = booklanguage; }
    public Integer getTotalbook() { return totalbook; }
    public void setTotalbook(Integer totalbook) { this.totalbook = totalbook; }
    public Double getBookprice() { return bookprice; }
    public void setBookprice(Double bookprice) { this.bookprice = bookprice; }
}