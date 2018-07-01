package com.test.BridgeMode;

/**
 * @创建人: $AUTHOR$
 * @描述: 圆形
 * @创建时间: 17:43$ 2018/7/1$
 * @修改原因:
 */
public class RedCircle implements DrawApi {

    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: "+radius+" ,x: " +x+", "+ y +"]");
    }
}
