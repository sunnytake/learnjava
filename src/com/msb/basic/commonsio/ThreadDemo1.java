package com.msb.basic.commonsio;

public class ThreadDemo1 extends Thread{

    @Override
    public void run() {
        for(int i=0; i<10; i++)
            System.out.println(Thread.currentThread().getName() + "===================" + i);
    }

    public static void main(String[] args) {
        ThreadDemo1 demo1 = new ThreadDemo1();
        demo1.start();
        for(int i=0; i<5; i++)
            System.out.println(Thread.currentThread().getName() + "===================" + i);
    }

}
