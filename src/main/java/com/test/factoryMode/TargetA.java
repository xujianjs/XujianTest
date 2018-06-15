package com.test.factoryMode;

public class TargetA extends TargetExecutor {
    @Override
    public void process() {
        super.process();
        System.out.println("执行A...........");

    }
}
