package com.test.factoryMode;

/**
 * @ClassName TargetB
 * @Description TODO
 * @Author 徐健
 * @Date 2018/6/15 8:23
 * @Version 1.0
 **/
public class TargetB extends TargetExecutor {
    @Override
    public void process() {
        super.process();
        System.out.println("执行B...............");
    }
}
