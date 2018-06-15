package com.test.factoryMode;

/**
 * @ClassName TargetOther
 * @Description TODO
 * @Author 徐健
 * @Date 2018/6/15 8:25
 * @Version 1.0
 **/
public class TargetOther extends TargetExecutor {
    @Override
    public void process() {
        super.process();
        System.out.println("执行其他............");
    }
}
