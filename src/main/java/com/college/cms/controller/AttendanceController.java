package com.college.cms.controller;

import com.college.cms.entity.Attendance;
import com.college.cms.service.AttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/attendance")
// Yahan "methods" mein OPTIONS add kiya hai, jo CORS pre-flight ke liye zaruri hai
@CrossOrigin(origins = "http://localhost:5173", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.OPTIONS}, allowedHeaders = "*")
public class AttendanceController {

    @Autowired
    private AttendanceService attendanceService;

    @PostMapping("/save")
    public ResponseEntity<String> saveAttendance(@RequestBody Attendance attendance) {
        try {
            attendanceService.saveAttendance(attendance);
            return ResponseEntity.ok("Attendance Saved Successfully!");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error: " + e.getMessage());
        }
    }
}