package com.makersharks.suppliersearchapi.service;

import com.makersharks.suppliersearchapi.entity.Supplier;
import java.util.List;

public interface SupplierService {
    Supplier saveSupplier(Supplier supplier);
    Supplier getSupplierById(Long id);
    void deleteSupplierById(Long id);
    List<Supplier> getAllSuppliers();
    List<Supplier> findSuppliersByCriteria(String location, String natureOfBusiness, String manufacturingProcess, int limit);
}
