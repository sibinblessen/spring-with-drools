package com.sibin.springwithdrools.api.service;

import com.sibin.springwithdrools.api.dto.RequestDto;
import com.sibin.springwithdrools.api.dto.ResponseDto;
import com.sibin.springwithdrools.api.dto.ResponseStatusDto;
import com.sibin.springwithdrools.engine.RuleEngine;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RuleService {

    private final RuleEngine ruleEngine;

    public ResponseDto validateRules(RequestDto request) {
        ruleEngine.validateRules(request);

        ResponseDto response = new ResponseDto();
        ResponseStatusDto status = new ResponseStatusDto();
        status.setCode("SUCCESS");
        status.setMessage("All rules triggered successfully.");
        response.setStatus(status);
        response.setResponse(request.toString());
        return response;
    }
}
