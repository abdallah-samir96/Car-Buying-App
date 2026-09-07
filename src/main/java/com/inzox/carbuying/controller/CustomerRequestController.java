package com.inzox.carbuying.controller;


import com.inzox.carbuying.dto.CreateCustomerRequestDto;
import com.inzox.carbuying.dto.CustomerRequestResponseDto;
import com.inzox.carbuying.service.CustomerRequestService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/customer-requests")
public class CustomerRequestController {

    private final CustomerRequestService customerRequestService;


    @Autowired
    public CustomerRequestController( CustomerRequestService customerRequestService) {
        this.customerRequestService = customerRequestService;
    }

    /**
     * Create a new customer request.
     */
    @PostMapping
    public ResponseEntity<CustomerRequestResponseDto> createRequest(@Valid @RequestBody CreateCustomerRequestDto request) {

        CustomerRequestResponseDto response = customerRequestService.create(request);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(response);
    }

}