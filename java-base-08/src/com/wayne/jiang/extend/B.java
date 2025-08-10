package com.wayne.jiang.extend;

public class B extends A{

    //子类可以继承父类非私有成员，父类私有成员不可访问
    public void print3(){
        System.out.println(i);
        print1();
    }
}
