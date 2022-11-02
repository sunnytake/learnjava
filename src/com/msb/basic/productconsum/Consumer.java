package com.msb.basic.productconsum;

public class Consumer implements Runnable{

    private Goods good;

    public Consumer(Goods good) {
        this.good = good;
    }

    @Override
    public void run() {
        for(int i=0; i<10; i++){
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("消费者取走了"+this.good.getBrand() + "---" + this.good.getName());
        }
    }
}
