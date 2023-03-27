package com.sibin.springwithdrools.api.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseDto {
    private ResponseStatusDto status;
    private String response;
}
