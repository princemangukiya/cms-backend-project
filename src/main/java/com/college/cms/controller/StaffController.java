package com.college.cms.controller;

import com.college.cms.entity.Staff;
import com.college.cms.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/staff")
@CrossOrigin(origins = "http://localhost:5173")
public class StaffController {
    @Autowired
    private StaffService staffService;

    @PostMapping("/add")
    public Staff addStaff(@RequestBody Staff staff) {
        return staffService.saveStaff(staff);
    }
}