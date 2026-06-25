package com.college.cms.controller;

import com.college.cms.entity.BookIssue;
import com.college.cms.service.BookIssueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/book-issues")
@CrossOrigin(origins = "http://localhost:5173", methods = {RequestMethod.POST, RequestMethod.OPTIONS}, allowedHeaders = "*")
public class BookIssueController {

    @Autowired
    private BookIssueService service;
    @PostMapping
    public ResponseEntity<?> saveBookIssue(@RequestBody BookIssue bookIssue) {
        try {
            // Basic validation
            if (bookIssue.getBookId() == null || bookIssue.getUserId() == null) {
                return ResponseEntity.badRequest().body("Book ID and User ID are required.");
            }
            service.saveBookIssue(bookIssue);
            return ResponseEntity.ok("Book Issued Successfully!");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Database Error: Check if Book ID/User ID exist.");
        }
    }
}