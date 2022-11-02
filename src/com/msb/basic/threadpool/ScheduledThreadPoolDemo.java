package com.msb.basic.threadpool;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPoolDemo {
    public static void main(String[] args) {
        ScheduledExecutorService service = Executors.newScheduledThreadPool(3);
        for(int i=0; i<20; i++)
            service.schedule(new Runnable() {
                @Override
                public void run() {
                    System.out.println("延迟三秒执行");
                }
            }, 3, TimeUnit.SECONDS);
        service.shutdown();
    }
}
