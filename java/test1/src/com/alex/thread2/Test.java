package com.alex.threadsafe;

public class Test {
    public static void main(String[] args) {
        //创建一个对象
        Account act=new Account("ACT-001",10000);
        //创建两个线程 对象传递进去 形参还是引用
        Thread t1=new AccountThread(act);
        Thread t2=new AccountThread(act);

        t1.setName("t1");
        t2.setName("t2");
        t1.start();
        t2.start();

    }
}
