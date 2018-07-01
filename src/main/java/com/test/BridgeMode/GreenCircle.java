package com.test.BridgeMode;

/**
 * @创建人: $AUTHOR$
 * @描述:
 * @创建时间: 17:53$ 2018/7/1$
 * @修改原因:
 */
public class GreenCircle implements DrawApi {
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: "+radius+" ,x: " +x+", "+ y +"]");
    }

}
