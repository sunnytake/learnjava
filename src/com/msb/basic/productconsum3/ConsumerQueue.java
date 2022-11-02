package com.msb.basic.productconsum3;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;

public class ConsumerQueue implements Runnable{

    private BlockingQueue blockingQueue;

    public ConsumerQueue(BlockingQueue blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        for(int i=0; i<10; i++){
            try {
                System.out.println("消费者消费了商品：" + blockingQueue.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
