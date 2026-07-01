package com.college.cms.service.impl;

import com.college.cms.entity.CompanyPlacement;
import com.college.cms.repository.CompanyPlacementRepository;
import com.college.cms.service.CompanyPlacementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompanyPlacementServiceImpl implements CompanyPlacementService {

    @Autowired
    private CompanyPlacementRepository repo;

    @Override
    public CompanyPlacement saveCompany(CompanyPlacement c) {
        return repo.save(c);
    }

    @Override
    public List<CompanyPlacement> getAllCompanies() {
        return repo.findAll();
    }

    @Override
    public Optional<CompanyPlacement> getCompanyById(Long id) {
        return repo.findById(id);
    }

    @Override
    public CompanyPlacement updateCompany(Long id, CompanyPlacement c) {

        CompanyPlacement existing = repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Not found"));

        existing.setCompanyName(c.getCompanyName());
        existing.setLocation(c.getLocation());
        existing.setJobRole(c.getJobRole());
        existing.setPackageLpa(c.getPackageLpa());
        existing.setWebsite(c.getWebsite());

        return repo.save(existing);
    }

    @Override
    public void deleteCompany(Long id) {
        repo.deleteById(id);
    }
}