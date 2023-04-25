package com.demo;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CreateResult implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        List<String> result = new ArrayList<>();
        delegateExecution.setVariable("result", result);
    }
}
