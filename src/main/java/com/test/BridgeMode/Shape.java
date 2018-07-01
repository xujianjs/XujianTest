package com.test.BridgeMode;

/**
 * @创建人: $AUTHOR$
 * @描述: 图形  =>颜色 + 形状
 * @创建时间: 17:54$ 2018/7/1$
 * @修改原因:
 */
public abstract class Shape {
    protected DrawApi drawApi;//设置成protected  对子类开放access权限

    public Shape(DrawApi drawApi) {
        this.drawApi=drawApi;
    }


    public abstract void draw();

}
