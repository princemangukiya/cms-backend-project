package com.college.cms.controller;

import com.college.cms.entity.Exam;
import com.college.cms.service.ExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/exams")
@CrossOrigin(origins = "http://localhost:5173") // Aapke React app ka URL
public class ExamController {

    @Autowired
    private ExamService service;

    @PostMapping
    public Exam addExam(@RequestBody Exam exam) {
        return service.saveExam(exam);
    }
}