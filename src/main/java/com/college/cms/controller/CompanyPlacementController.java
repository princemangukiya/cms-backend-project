package com.college.cms.controller;

import com.college.cms.entity.CompanyPlacement;
import com.college.cms.service.CompanyPlacementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/companyplacements") // 👈 MATCHED WITH FRONTEND
@CrossOrigin(origins = "http://localhost:3000")
public class CompanyPlacementController {

    @Autowired
    private CompanyPlacementService service;

    @PostMapping
    public CompanyPlacement save(@RequestBody CompanyPlacement c) {
        return service.saveCompany(c);
    }

    @GetMapping
    public List<CompanyPlacement> getAll() {
        return service.getAllCompanies();
    }

    @GetMapping("/{id}")
    public CompanyPlacement getById(@PathVariable Long id) {
        return service.getCompanyById(id)
                .orElseThrow(() -> new RuntimeException("Not found"));
    }

    @PutMapping("/{id}")
    public CompanyPlacement update(@PathVariable Long id,
                                   @RequestBody CompanyPlacement c) {
        return service.updateCompany(id, c);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        service.deleteCompany(id);
        return "Deleted successfully";
    }
}