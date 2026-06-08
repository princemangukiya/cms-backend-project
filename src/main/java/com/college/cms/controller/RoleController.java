package com.college.cms.controller;

import com.college.cms.entity.Role;
import com.college.cms.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/roles")
@CrossOrigin(origins = "http://localhost:5173")
public class RoleController {

    @Autowired
    private RoleService roleService;

    // Saare roles fetch karne ke liye (e.g., Register form ke dropdown ke liye)
    @GetMapping("/all")
    public List<Role> getAllRoles() {
        return roleService.getAllRoles();
    }
}