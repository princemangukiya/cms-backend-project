package com.college.cms.repository;

import com.college.cms.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    // JpaRepository pehle se hi save() method provide karta hai,
    // isliye yahan extra code ki zaroorat nahi hai.
}