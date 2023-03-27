package com.sibin.springwithdrools.engine;

import com.sibin.springwithdrools.api.dto.RequestDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class RuleEngine {

    private final KieContainer kieContainer;

    public RequestDto validateRules(RequestDto request) {
        KieSession kieSession = kieContainer.newKieSession();
        kieSession.insert(request);
        kieSession.fireAllRules();
        kieSession.dispose();
        log.info("Response: {}", request.toString());
        return request;
    }
}
