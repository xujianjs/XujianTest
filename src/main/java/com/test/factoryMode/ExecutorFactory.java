package com.test.factoryMode;

/**
 * @ClassName ExecutorFactory
 * @Description TODO
 * @Author 徐健
 * @Date 2018/6/15 8:15
 * @Version 1.0
 **/
public class ExecutorFactory {
    public TargetExecutor getExecutor(String target){
        if (target.equals("targetA")){
            return new TargetA();
        }else if(target.equals("targetB")){
            return new TargetB();
        }else {
            return new TargetOther();
        }

    }
}
