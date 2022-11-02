package com.msb.basic.productconsum2;

public class Goods {

    private String brand;
    private String name;
    // 默认不存在商品。
    private boolean flag = false;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public synchronized void get() throws InterruptedException {
        if(this.flag) {
            System.out.println("消费者消费了" + this.getBrand() + "---" + this.getName());
            this.flag = false;
            notify();
        }else{
            wait();
        }
    }

    public synchronized void set(String brand, String name) throws InterruptedException {
        // 生产者抢占资源后判断当前商品是否有值，如果有提醒消费者消费，并且将当前线程设置为阻塞状态
        if(flag){
            wait();
        }else{
            this.setBrand(brand);
            this.setName(name);
            System.out.println("生产者生产了" + this.getBrand() + "---" + this.getName());
            this.flag = true;
            notify();
        }
    }
}
