package com.college.cms.service;

import com.college.cms.entity.Exam;
import com.college.cms.repository.ExamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExamService {
    @Autowired
    private ExamRepository repository;

    public Exam saveExam(Exam exam) {
        return repository.save(exam);
    }
}