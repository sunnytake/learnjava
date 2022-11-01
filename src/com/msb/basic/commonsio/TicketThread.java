package com.msb.basic.commonsio;

public class TicketThread extends Thread{
    private static int ticket = 5;

    @Override
    public void run() {
        for(int i=0; i<100; i++) {
            if (ticket > 0)
                System.out.println(Thread.currentThread().getName() + "正在出售第" + (ticket--) + "张票");
        }
    }

    public static void main(String[] args) {
        TicketThread thread1 = new TicketThread();
        thread1.start();
        TicketThread thread2 = new TicketThread();
        thread2.start();
        TicketThread thread3 = new TicketThread();
        thread3.start();
        TicketThread thread4 = new TicketThread();
        thread4.start();

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}

