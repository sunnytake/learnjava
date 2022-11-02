package com.msb.basic.productconsum2;

public class Producer implements Runnable{

    private Goods goods;

    public Producer(Goods goods) {
        this.goods = goods;
    }

    @Override
    public void run() {
        for(int i=0; i<10; i++){
            if(i%2==0){
                try {
                    this.goods.set("娃哈哈", "矿泉水");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else{
                try {
                    this.goods.set("旺仔", "小馒头");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
