package com.test.FlyweightMode;

import java.util.HashMap;

class  FlyweightFactory{
    private HashMap<Object,Flyweight> data;

    public FlyweightFactory(){ data = new HashMap();}

    public Flyweight getFlyweight(Object object){
        if ( data.containsKey(object)){
            return data.get(object);
        }else {
            Flyweight flyweight = new Flyweight(object);
            data.put(object,flyweight);
            return flyweight;
        }
    }
}