package com.alex.threadsafe;

public class AccountThread extends Thread{
    //两个线程共享一个用户
    private Account act;

    //这个一个类 通过构造函数来创建对象
    public AccountThread(Account act) {
        this.act = act;
    }

    @Override
    public void run() {
       double money=5000;

        act.withdraw(5000);
        System.out.println(Thread.currentThread().getName()+"账户"+act.getActno()+"取款成功"+act.getBalance());
    }
}
