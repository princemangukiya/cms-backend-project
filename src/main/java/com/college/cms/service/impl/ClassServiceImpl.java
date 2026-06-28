package com.college.cms.service.impl;

import com.college.cms.entity.ClassMgmt;
import com.college.cms.repository.ClassRepository;
import com.college.cms.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClassServiceImpl implements ClassService {
    @Autowired
    private ClassRepository classRepository;

    @Override
    public ClassMgmt saveClass(ClassMgmt classMgmt) {
        return classRepository.save(classMgmt);
    }
}