package com.college.cms.service.impl;

import com.college.cms.entity.Fees;
import com.college.cms.repository.FeesRepository;
import com.college.cms.service.FeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FeesServiceImpl implements FeesService {

    @Autowired
    private FeesRepository feesRepository;

    @Override
    public Fees saveFees(Fees fees) {
        return feesRepository.save(fees);
    }

    @Override
    public List<Fees> getAllFees() {
        return feesRepository.findAll();
    }

    @Override
    public Optional<Fees> getFeesById(Long id) {
        return feesRepository.findById(id);
    }

    @Override
    public Fees updateFees(Long id, Fees feesDetails) {

        Fees existingFees = feesRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Fees not found with id: " + id));

        existingFees.setCourseId(feesDetails.getCourseId());
        existingFees.setStudentId(feesDetails.getStudentId());
        existingFees.setScholarship(feesDetails.getScholarship());
        existingFees.setDiscountPercentage(feesDetails.getDiscountPercentage());
        existingFees.setTotalFees(feesDetails.getTotalFees());

        return feesRepository.save(existingFees);
    }

    @Override
    public void deleteFees(Long id) {

        if (!feesRepository.existsById(id)) {
            throw new RuntimeException("Fees not found with id: " + id);
        }

        feesRepository.deleteById(id);
    }
}