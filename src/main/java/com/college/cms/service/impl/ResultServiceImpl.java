package com.college.cms.service.impl;

import com.college.cms.entity.*;
import com.college.cms.repository.*;
import com.college.cms.service.ResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResultServiceImpl implements ResultService {

    @Autowired
    private ResultRepository resultRepository;
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private SubjectRepository subjectRepository;
    @Override
    public void saveResult(Result result) {

        Long sId = result.getStudent().getStudent_id();
        Long subId = result.getSubject().getSubject_id();

        Student student = studentRepository.findById(sId)
                .orElseThrow(() -> new RuntimeException("Student not found"));

        Subject subject = subjectRepository.findById(subId)
                .orElseThrow(() -> new RuntimeException("Subject not found"));

        result.setStudent(student);
        result.setSubject(subject);

        resultRepository.save(result);
    }
}