package com.msb.basic.productconsum3;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;

public class ProducerQueue implements Runnable{

    private BlockingQueue blockingQueue;

    public ProducerQueue(BlockingQueue blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        for(int i=0; i<10; i++) {
            System.out.println("生产者生产了商品：" + i);
            try {
                blockingQueue.put(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
