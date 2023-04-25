package com.demo;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

@Component
public class UpdateResult implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        List<String> result = (List<String>) delegateExecution.getVariable("result");
        result.add(UUID.randomUUID().toString());
        System.out.println(Instant.now() + " " + delegateExecution.getProcessInstanceId() + " " + Thread.currentThread().getId());
        delegateExecution.setVariableLocal("result", result);
    }
}
