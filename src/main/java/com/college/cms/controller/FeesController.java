package com.college.cms.controller;

import com.college.cms.entity.Fees;
import com.college.cms.service.FeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/fees")
@CrossOrigin(origins = "*")
public class FeesController {

    @Autowired
    private FeesService feesService;

    @PostMapping
    public Fees saveFees(@RequestBody Fees fees) {
        return feesService.saveFees(fees);
    }

    @GetMapping
    public List<Fees> getAllFees() {
        return feesService.getAllFees();
    }

    @GetMapping("/{id}")
    public Optional<Fees> getFeesById(@PathVariable Long id) {
        return feesService.getFeesById(id);
    }

    @PutMapping("/{id}")
    public Fees updateFees(@PathVariable Long id, @RequestBody Fees fees) {
        return feesService.updateFees(id, fees);
    }

    @DeleteMapping("/{id}")
    public void deleteFees(@PathVariable Long id) {
        feesService.deleteFees(id);
    }
}