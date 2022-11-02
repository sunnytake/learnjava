package com.msb.basic.commonsio;

public class SleepTest {
    public static void main(String[] args) throws InterruptedException {
        MyRun myRun = new MyRun();
        Thread thread = new Thread(myRun);
        thread.start();

        for(int i=0; i<5; i++) {
            System.out.println(Thread.currentThread().getName() + "========================" + i);
            if(i==3)
                Thread.sleep(1000L);
        }

    }
}
