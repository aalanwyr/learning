package com.alex.threadsafe;
/*
银行账户
 */
public class Account {
    private String actno;
    private  double balance;

    public Account(String actno,double balance)
    {
        this.actno=actno;
        this.balance=balance;
    }
    public String getActno() {
        return actno;
    }


    public void setActno(String actno) {
        this.actno = actno;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //qukuan
    public void withdraw(double money){
        double before=this.getBalance();
        double after=before-money;
        try {
            Thread.sleep(1000*1);//让调用这个线程睡眠等待1s
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.setBalance(after);
    }

}
