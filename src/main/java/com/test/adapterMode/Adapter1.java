package com.test.adapterMode;

/**
 * @创建人: $AUTHOR$
 * @描述:
 * @创建时间: 15:33$ 2018/6/23$
 * @修改原因:
 */
public class Adapter1 extends Usber implements Ps2 {
    @Override
    public void isPs2() {
        isUsb();
    }
}
