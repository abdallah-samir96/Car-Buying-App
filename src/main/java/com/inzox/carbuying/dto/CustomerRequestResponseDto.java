package com.inzox.carbuying.dto;

import lombok.Builder;
import lombok.Getter;
import java.time.LocalDateTime;

@Getter
@Builder
public class CustomerRequestResponseDto {

    private Long id;

    private Long customerId;

    private RequestStatus status;

    private String description;

    private InspectionCompany checkedByCompany;

    private Long offersCount;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}