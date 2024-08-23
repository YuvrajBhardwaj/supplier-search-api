package com.makersharks.suppliersearchapi.controller;

import com.makersharks.suppliersearchapi.dto.SupplierRequest;
import com.makersharks.suppliersearchapi.entity.Supplier;
import com.makersharks.suppliersearchapi.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/supplier")
public class SupplierController {

    private final SupplierService supplierService;

    @Autowired
    public SupplierController(SupplierService supplierService) {
        this.supplierService = supplierService;
    }

    @GetMapping("/query")
    public ResponseEntity<List<Supplier>> getSuppliersByCriteria(
            @RequestParam String location,
            @RequestParam String natureOfBusiness,
            @RequestParam String manufacturingProcess,
            @RequestParam(defaultValue = "10") int limit // Default limit to 10
    ) {
        List<Supplier> suppliers = supplierService.findSuppliersByCriteria(location, natureOfBusiness, manufacturingProcess, limit);
        return ResponseEntity.ok(suppliers);
    }


    @PostMapping
    public ResponseEntity<Supplier> saveSupplier(@RequestBody SupplierRequest supplierRequest) {
        Supplier supplier = new Supplier();
        supplier.setCompanyName(supplierRequest.getCompanyName());
        supplier.setWebsite(supplierRequest.getWebsite());
        supplier.setLocation(supplierRequest.getLocation());
        supplier.setNatureOfBusiness(supplierRequest.getNatureOfBusiness());
        supplier.setManufacturingProcesses(supplierRequest.getManufacturingProcesses());

        Supplier savedSupplier = supplierService.saveSupplier(supplier);
        return ResponseEntity.ok(savedSupplier);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Supplier> getSupplierById(@PathVariable Long id) {
        Supplier supplier = supplierService.getSupplierById(id);
        return supplier != null ? ResponseEntity.ok(supplier) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSupplierById(@PathVariable Long id) {
        supplierService.deleteSupplierById(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<List<Supplier>> getAllSuppliers() {
        List<Supplier> suppliers = supplierService.getAllSuppliers();
        return ResponseEntity.ok(suppliers);
    }
}
