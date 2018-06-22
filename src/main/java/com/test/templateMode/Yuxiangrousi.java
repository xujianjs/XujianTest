package com.test.templateMode;

/**
 * @创建人: $AUTHOR$
 * @描述:鱼香肉丝
 * @创建时间: 22:31$ 2018/6/21$
 * @修改原因:
 */
public class Yuxiangrousi extends ChuancaiTemplate {
    @Override
    protected void xiacai() {
        System.out.println("肉丝,胡萝卜,泡椒下锅");
    }

    @Override
    protected boolean buxiangxiwan() {
        return true;
    }
}
