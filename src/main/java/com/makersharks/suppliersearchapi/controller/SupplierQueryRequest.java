package com.makersharks.suppliersearchapi.controller;

import lombok.Data;

@Data
public class SupplierQueryRequest {

    private String location;
    private String natureOfBusiness;  // Change to String
    private String manufacturingProcess;  // Change to String
}
