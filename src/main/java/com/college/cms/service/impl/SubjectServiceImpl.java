package com.college.cms.service.impl;

import com.college.cms.entity.Subject;
import com.college.cms.repository.SubjectRepository;
import com.college.cms.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubjectServiceImpl implements SubjectService {

    @Autowired
    private SubjectRepository subjectRepository;

    @Override
    public void saveSubject(Subject subject) {
        // Database mein data save hoga
        subjectRepository.save(subject);
    }
}