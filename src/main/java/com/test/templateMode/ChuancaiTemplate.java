package com.test.templateMode;

/**
 * @创建人: $AUTHOR$
 * @描述: 川菜模板
 * @创建时间: 22:23$ 2018/6/21$
 * @修改原因:
 */
public abstract class ChuancaiTemplate {
    private String name="菜名";

    public String getName() {
        return name;
    }

    /*
     * 川菜做法基础模板
     * */
    public final void cookTempalte() {
        //热锅
        reguo();

        //下作料
        xiazuoliao();

        //下菜
        xiacai();

        //炒菜
        chaocai();

        if (!buxiangxiwan()) {
            //出锅
            chuguo();
        }

    }

    //钩子函数(增强子类的扩展性)
    protected boolean buxiangxiwan() {
        return false;
    }

    private void chuguo() {
        System.out.println("出锅");
    }

    private void chaocai() {
        System.out.println("炒菜");
    }

    protected abstract void xiacai();

    private void xiazuoliao() {
        System.out.println("下葱姜蒜");
    }

    private void reguo() {
        System.out.println("热油锅");
    }


}
