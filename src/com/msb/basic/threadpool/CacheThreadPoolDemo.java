package com.msb.basic.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CacheThreadPoolDemo {

    public static void main(String[] args) {
        ExecutorService service = Executors.newCachedThreadPool();
        for(int i=0; i<20; i++) {
            service.execute(new Task());
        }
        service.shutdown();
    }

}
