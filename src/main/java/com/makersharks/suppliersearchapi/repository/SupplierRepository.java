package com.makersharks.suppliersearchapi.repository;

import com.makersharks.suppliersearchapi.entity.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository extends JpaRepository<Supplier, Long> {
}
