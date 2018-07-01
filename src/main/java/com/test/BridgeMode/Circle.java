package com.test.BridgeMode;

/**
 * @创建人: $AUTHOR$
 * @描述: 桥接 Shape  和 DrawApi
 * @创建时间: 17:57$ 2018/7/1$
 * @修改原因:
 */
public class Circle extends Shape {
    private int x, y, radius;

    public Circle(int x, int y, int radius, DrawApi drawApi) {
        super(drawApi);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void draw() {
        drawApi.drawCircle(radius,x,y);
    }

}
