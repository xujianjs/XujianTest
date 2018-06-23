package com.test.proxyMode;

/**
 * @创建人: $AUTHOR$
 * @描述:
 * @创建时间: 19:15$ 2018/6/23$
 * @修改原因:
 */
public class UserDao implements IuserDao {
    @Override
    public void save() {
        System.out.println("开始保存................");
    }
}
