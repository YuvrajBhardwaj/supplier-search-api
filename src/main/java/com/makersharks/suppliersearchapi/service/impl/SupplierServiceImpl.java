package com.makersharks.suppliersearchapi.service.impl;

import com.makersharks.suppliersearchapi.entity.Supplier;
import com.makersharks.suppliersearchapi.repository.SupplierRepository;
import com.makersharks.suppliersearchapi.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SupplierServiceImpl implements SupplierService {

    private final SupplierRepository supplierRepository;

    @Autowired
    public SupplierServiceImpl(SupplierRepository supplierRepository) {
        this.supplierRepository = supplierRepository;
    }

    @Override
    public Supplier saveSupplier(Supplier supplier) {
        return supplierRepository.save(supplier);
    }

    @Override
    public Supplier getSupplierById(Long id) {
        return supplierRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteSupplierById(Long id) {
        supplierRepository.deleteById(id);
    }

    @Override
    public List<Supplier> getAllSuppliers() {
        return supplierRepository.findAll();
    }

    @Override
    public List<Supplier> findSuppliersByCriteria(String location, String natureOfBusiness, String manufacturingProcess, int limit) {
        return supplierRepository.findAll().stream()
                .filter(supplier -> supplier.getLocation().equalsIgnoreCase(location))
                .filter(supplier -> supplier.getNatureOfBusiness().equalsIgnoreCase(natureOfBusiness))
                .filter(supplier -> supplier.getManufacturingProcesses().contains(manufacturingProcess))
                .limit(limit)
                .collect(Collectors.toList());
    }
}
