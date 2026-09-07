package com.inzox.carbuying.mapper;

import com.inzox.carbuying.Model.CustomerRequest;
import com.inzox.carbuying.dto.CustomerRequestResponseDto;

public class CustomerRequestMapper implements Mapper<CustomerRequest, CustomerRequestResponseDto> {
    @Override
    public CustomerRequest toEntity(CustomerRequestResponseDto dto) {
        return null;
    }

    @Override
    public CustomerRequestResponseDto toDTO(CustomerRequest request) {
        return CustomerRequestResponseDto.builder()
                .id(request.getId())
                .customerId(request.getCustomerId())
                .status(request.getStatus())
                .description(request.getDescription())
                .checkedByCompany(request.getCheckedByCompany())
                .offersCount((long) request.getOffers().size())
                .createdAt(request.getCreatedAt())
                .updatedAt(request.getUpdatedAt())
                .build();
    }
}
