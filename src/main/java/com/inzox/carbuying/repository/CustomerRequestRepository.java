package com.inzox.carbuying.repository;

import com.inzox.carbuying.Model.CustomerRequest;
import com.inzox.carbuying.dto.RequestStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRequestRepository extends JpaRepository<CustomerRequest, Long> {

    Page<CustomerRequest> findByStatus(RequestStatus status, Pageable pageable);
    Page<CustomerRequest> findByCustomerId(Long customerId, Pageable pageable);
    Page<CustomerRequest> findByCustomerIdAndStatus(Long customerId, RequestStatus status, Pageable pageable);
}