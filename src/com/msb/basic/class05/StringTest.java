package com.msb.basic.class05;

public class StringTest {
    public static void main(String[] args) {
        // StringBuffer：线程安全
        StringBuffer bf = new StringBuffer();
        bf.append(1).append(1.234).append("abc").append(true);
        System.out.println(bf);
        System.out.println(bf.length());
        System.out.println(bf.capacity());

        // StringBuilder
        StringBuilder sb = new StringBuilder();
        sb.append(1).append(1.234).append("abc").append(true);
        System.out.println(sb);
    }
}



















