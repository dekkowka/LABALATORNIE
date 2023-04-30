package com.example.testrestservicee1.model;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Response {

    private String uid;

    private String operationUid;

    private String systemTime;

    private String code;

    private String errorCode;

    private String errorMessage;


}