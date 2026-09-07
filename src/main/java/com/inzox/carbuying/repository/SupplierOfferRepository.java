package com.inzox.carbuying.repository;

import com.inzox.carbuying.Model.SupplierOffer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SupplierOfferRepository extends JpaRepository<SupplierOffer, Long> {
    List<SupplierOffer> findByRequestId(Long requestId);
    Page<SupplierOffer> findBySupplierId(Long supplierId, Pageable pageable);
    boolean existsByRequestIdAndSupplierId(Long requestId, Long supplierId);
    Optional<SupplierOffer> findByRequestIdAndSupplierId(Long requestId, Long supplierId);
}