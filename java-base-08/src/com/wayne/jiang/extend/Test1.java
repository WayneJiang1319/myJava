package com.wayne.jiang.extend;

public class Test1 {
    public static void main(String[] args) {
        B b=new B();
        System.out.println(b.i);
        b.print1();
        b.print3();

        Teacher t=new Teacher();
        t.setName("james");
        t.setSkill("java");
        System.out.println(t.getName());
        System.out.println(t.getSkill());
        t.printInfo();
       // b.print2();
    }
}
