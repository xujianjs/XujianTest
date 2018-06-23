package com.test.deecoratorMode;

/**
 * @创建人: $AUTHOR$
 * @描述:修饰女孩是如何漂亮的
 * @创建时间: 18:11$ 2018/6/23$
 * @修改原因:
 */
public class DecoratorGirl implements Girl {
    private Girl girl;

    public void wearHotPairs() {
        System.out.println("穿热裤...");
    }

    public void virgo() {
        System.out.println("大湿胸");
    }

    @Override
    public void howBeautiful() {
        wearHotPairs();
        virgo();
        girl.howBeautiful();
    }
}
