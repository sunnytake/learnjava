package com.msb.basic.commonsio;

public class ThreadAPIDemo {

    public static void main(String[] args) {
        // 获取当前thread对象
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName() + " , " + thread.getId() + " , " + thread.getPriority());
    }

}
