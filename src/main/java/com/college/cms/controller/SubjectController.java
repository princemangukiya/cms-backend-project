package com.college.cms.controller;

import com.college.cms.entity.Subject;
import com.college.cms.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/subjects")
@CrossOrigin(origins = "http://localhost:5173")
public class SubjectController {

    @Autowired
    private SubjectService subjectService;

    @PostMapping("/save")
    public Subject addSubject(@RequestBody Subject subject) {
        // Yahan check karo console mein kya print ho raha hai!
        System.out.println("Backend Received: " + subject);
        return subjectService.saveSubject(subject);
    }
}