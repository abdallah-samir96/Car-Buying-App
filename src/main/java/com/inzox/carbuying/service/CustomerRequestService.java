package com.inzox.carbuying.service;


import com.inzox.carbuying.Model.CustomerRequest;
import com.inzox.carbuying.dto.CreateCustomerRequestDto;
import com.inzox.carbuying.dto.CustomerRequestResponseDto;
import com.inzox.carbuying.dto.RequestStatus;
import com.inzox.carbuying.mapper.CustomerRequestMapper;
import com.inzox.carbuying.repository.CustomerRequestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class CustomerRequestService {

    private final CustomerRequestRepository customerRequestRepository;
    private final CustomerRequestMapper mapper = new CustomerRequestMapper();

    public CustomerRequestResponseDto create(CreateCustomerRequestDto dto) {

        CustomerRequest request = CustomerRequest.builder()
                .customerId(dto.getCustomerId())
                .description(dto.getDescription())
                .checkedByCompany(dto.getCheckedByCompany())
                .status(RequestStatus.ACTIVE)
                .createdAt(LocalDateTime.now())
                .updatedAt(LocalDateTime.now())
                .build();
        CustomerRequest saved = customerRequestRepository.save(request);
        return mapper.toDTO(saved);
    }
}