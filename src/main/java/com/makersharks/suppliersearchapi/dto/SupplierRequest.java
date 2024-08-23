package com.makersharks.suppliersearchapi.dto;

import java.util.List;

public class SupplierRequest {
    private String companyName;
    private String website;
    private String location;
    private String natureOfBusiness;
    private List<String> manufacturingProcesses;

    // Getters and setters
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getNatureOfBusiness() {
        return natureOfBusiness;
    }

    public void setNatureOfBusiness(String natureOfBusiness) {
        this.natureOfBusiness = natureOfBusiness;
    }

    public List<String> getManufacturingProcesses() {
        return manufacturingProcesses;
    }

    public void setManufacturingProcesses(List<String> manufacturingProcesses) {
        this.manufacturingProcesses = manufacturingProcesses;
    }
}
