package com.demo;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DisplayResult implements JavaDelegate {

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        while (true) {
            List<String> result = (List<String>) delegateExecution.getVariable("result");
            Thread.sleep(1000);
            System.out.println("size: " + result.size());
            ;
        }

    }
}
