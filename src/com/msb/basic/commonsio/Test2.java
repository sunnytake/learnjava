package com.msb.basic.commonsio;

public class Test2 implements Runnable{

    @Override
    public void run() {
        for(int i=0; i<10; i++){
            System.out.println(Thread.currentThread().getName() + "======================" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Test2 test2 = new Test2();
        Thread thread = new Thread(test2);
        thread.start();
        for(int i=10; i>0; i--){
            System.out.println(Thread.currentThread().getName() + "======================" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
