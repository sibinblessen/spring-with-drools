package com.sibin.springwithdrools.api.controller;

import com.sibin.springwithdrools.api.dto.RequestDto;
import com.sibin.springwithdrools.api.dto.ResponseDto;
import com.sibin.springwithdrools.api.service.RuleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/rules/validate")
@RequiredArgsConstructor
public class RuleController {

    private final RuleService ruleService;

    @PostMapping("/normal")
    public ResponseEntity<ResponseDto> triggerAllRules(@RequestBody RequestDto request) {
        ResponseDto response = ruleService.validateRules(request);
        return ResponseEntity.ok(response);
    }

}
