package com.msb.basic.productconsum3;

import com.msb.basic.productconsum2.Producer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Test {
    public static void main(String[] args) {
        BlockingQueue queue = new ArrayBlockingQueue(5);
        ProducerQueue producerQueue = new ProducerQueue(queue);
        ConsumerQueue consumerQueue = new ConsumerQueue(queue);
        Thread producerThread = new Thread(producerQueue);
        Thread consumerThread = new Thread(consumerQueue);
        producerThread.start();
        consumerThread.start();
    }
}
