package com.sibin.springwithdrools.api.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class RequestDto {
    private String id;
    private String name;
    private String status;
    private String message;
}
