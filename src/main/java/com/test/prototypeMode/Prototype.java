package com.test.prototypeMode;

/**
 * @创建人: $AUTHOR$
 * @描述:原型模式  浅拷贝
 * @创建时间: 21:37$ 2018/6/22$
 * @修改原因:
 */
public class Prototype implements Cloneable{
    public Prototype(String name) {
        this.name = name;
    }

    private String name;


    public void setName(String name) {
        this.name = name;
    }


    @Override
    public Object clone()  {
        Prototype prototype=null;
        try {
            return (Prototype)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return prototype;
    }
}
