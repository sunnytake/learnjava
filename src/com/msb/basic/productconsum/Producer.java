package com.msb.basic.productconsum;

public class Producer implements Runnable{

    private Goods good;

    public Producer(Goods good) {
        this.good = good;
    }

    @Override
    public void run() {
        for(int i=0; i<10; i++){
            if(i%2 == 0){
                good.setBrand("娃哈哈");
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                good.setName("矿泉水");
            }else{
                good.setBrand("旺仔");
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                good.setName("小馒头");
            }
            System.out.println("生产了" + this.good.getBrand() + "---" + this.good.getName());
        }
    }
}
