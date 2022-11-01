package com.msb.basic.proxymodel;

public class XiMenQing {

    public static void main(String[] args) {
        PanjinLian panjinLian = new PanjinLian();
        Wangpo wangpo = new Wangpo(panjinLian);
        wangpo.playWithMen();
        wangpo.makeEyesWithMen();
    }
}
