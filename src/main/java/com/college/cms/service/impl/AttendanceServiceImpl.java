package com.college.cms.service.impl;

import com.college.cms.entity.Attendance;
import com.college.cms.repository.AttendanceRepository;
import com.college.cms.service.AttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AttendanceServiceImpl implements AttendanceService {

    @Autowired
    private AttendanceRepository attendanceRepository;

    @Override
    public void saveAttendance(Attendance attendance) {
        attendanceRepository.save(attendance);
    }
}