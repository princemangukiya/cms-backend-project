package com.college.cms.repository;

import com.college.cms.entity.Staff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Yahan String isliye hai kyunki aapke entity mein staffid String type ka hai
@Repository
public interface StaffRepository extends JpaRepository<Staff, String> {
    // JpaRepository extend karte hi .save() method apne aap aa jayega
}