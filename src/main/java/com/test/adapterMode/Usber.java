package com.test.adapterMode;

/**
 * @创建人: $AUTHOR$
 * @描述:
 * @创建时间: 15:32$ 2018/6/23$
 * @修改原因:
 */
public class Usber implements Usb {
    @Override
    public void isUsb() {
        System.out.println("Usb接口");
    }
}
