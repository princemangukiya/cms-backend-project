package com.college.cms.controller;

import com.college.cms.entity.Subject;
import com.college.cms.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/subjects")
@CrossOrigin(origins = "http://localhost:5173")
public class SubjectController {

    @Autowired
    private SubjectService subjectService;

    @PostMapping("/save")
    public ResponseEntity<String> saveSubject(@RequestBody Subject subject) {
        try {
            subjectService.saveSubject(subject);
            return ResponseEntity.ok("Subject saved successfully!");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error saving subject: " + e.getMessage());
        }
    }
}