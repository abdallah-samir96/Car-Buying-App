package com.inzox.carbuying.dto;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateCustomerRequestDto {

    @NotNull(message = "Customer ID is required")
    private Long customerId;

    @NotBlank(message = "Description is required")
    private String description;

    @NotNull(message = "Inspection company is required")
    private InspectionCompany checkedByCompany;
}