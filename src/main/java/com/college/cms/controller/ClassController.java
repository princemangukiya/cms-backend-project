package com.college.cms.controller;

import com.college.cms.entity.ClassMgmt;
import com.college.cms.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:5173")
public class ClassController {

    @Autowired
    private ClassService classService;

    @PostMapping("/class-management")
    public ResponseEntity<ClassMgmt> saveClass(@RequestBody ClassMgmt classMgmt) {
        return ResponseEntity.ok(classService.saveClass(classMgmt));
    }
}