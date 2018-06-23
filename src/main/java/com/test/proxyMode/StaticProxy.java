package com.test.proxyMode;

/**
 * @创建人: $AUTHOR$
 * @描述: 静态代理  需要实现目标对象的接口
 * @创建时间: 19:16$ 2018/6/23$
 * @修改原因:
 */
public class StaticProxy  implements IuserDao{
    private IuserDao iuserDao;

    public StaticProxy(IuserDao iuserDao) {
        this.iuserDao = iuserDao;
    }

    @Override
    public void save() {
        System.out.println("开始静态代理事务...........");
        iuserDao.save();
        System.out.println("静态代理事务完毕...........");
    }
}
