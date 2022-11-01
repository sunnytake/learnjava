package com.msb.basic.commonsio;

public class RunnableDemo1 implements Runnable{
    @Override
    public void run() {
        for(int i=0; i<10; i++)
            System.out.println(Thread.currentThread().getName() + "===================" + i);
    }

    public static void main(String[] args) {
        RunnableDemo1 demo1 = new RunnableDemo1();
        Thread thread = new Thread(demo1);
        thread.start();

        for(int i=0; i<5; i++)
            System.out.println(Thread.currentThread().getName() + "===================" + i);
    }
}
