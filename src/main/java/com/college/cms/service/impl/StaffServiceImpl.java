package com.college.cms.service.impl;
import com.college.cms.entity.Staff;
import com.college.cms.repository.StaffRepository;
import com.college.cms.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StaffServiceImpl implements StaffService {
    @Autowired private StaffRepository repo;
    @Override public Staff saveStaff(Staff staff) { return repo.save(staff); }
}