package com.spring.demo.loosely_coupled;

public class CsvOutputGenerator implements IOutputGenerator {

    @Override
    public void generatorOutput() {
        System.out.println("Creating CsvOutputGenerator  Output......");
    }
}
