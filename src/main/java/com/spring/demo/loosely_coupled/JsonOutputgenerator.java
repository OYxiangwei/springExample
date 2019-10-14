package com.spring.demo.loosely_coupled;

import org.springframework.stereotype.Component;

@Component
public class JsonOutputgenerator implements IOutputGenerator {
    @Override
    public void generatorOutput() {
        System.out.println("Creating JsonOutputGenerator  Output......");
    }
}
