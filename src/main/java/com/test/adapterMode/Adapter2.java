package com.test.adapterMode;

/**
 * @创建人: $AUTHOR$
 * @描述:
 * @创建时间: 15:39$ 2018/6/23$
 * @修改原因:
 */
public class Adapter2 implements Ps2 {
    private Usber usber;

    public Adapter2(Usber usber) {
        this.usber = usber;
    }

    @Override
    public void isPs2() {
            usber.isUsb();
    }
}
