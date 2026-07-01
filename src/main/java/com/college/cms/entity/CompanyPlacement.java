package com.college.cms.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "placement_company_detail")
public class CompanyPlacement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "company_id")
    private Long companyId;

    @Column(name = "company_name", nullable = false)
    private String companyName;

    @Column(name = "location", nullable = false)
    private String location;

    @Column(name = "job_role", nullable = false)
    private String jobRole;

    @Column(name = "package_lpa")
    private Double packageLpa;

    @Column(name = "website")
    private String website;

    // ✅ Default Constructor
    public CompanyPlacement() {
    }

    // ✅ Parameterized Constructor
    public CompanyPlacement(Long companyId, String companyName, String location,
                            String jobRole, Double packageLpa, String website) {
        this.companyId = companyId;
        this.companyName = companyName;
        this.location = location;
        this.jobRole = jobRole;
        this.packageLpa = packageLpa;
        this.website = website;
    }

    // ================= GETTERS =================

    public Long getCompanyId() {
        return companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getLocation() {
        return location;
    }

    public String getJobRole() {
        return jobRole;
    }

    public Double getPackageLpa() {
        return packageLpa;
    }

    public String getWebsite() {
        return website;
    }

    // ================= SETTERS =================

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setJobRole(String jobRole) {
        this.jobRole = jobRole;
    }

    public void setPackageLpa(Double packageLpa) {
        this.packageLpa = packageLpa;
    }

    public void setWebsite(String website) {
        this.website = website;
    }
}