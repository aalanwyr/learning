package com.alex;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Mythread mythread=new Mythread();
        mythread.start();

        for(int i=0;i<100;++i)
        {
            System.out.println("主线程"+i);
        }

    }
}
class Mythread extends Thread
{
    @Override
    public void run() {
        for(int i=0;i<100;++i)
        {
            System.out.println("分支线程"+i);
        }
    }
}