package com.inzox.carbuying.dto.error;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class FieldError {

    private String field;
    private String message;
}