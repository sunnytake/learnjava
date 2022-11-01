package com.msb.basic.proxymodel;

public class Wangpo implements KindWoman{

    private KindWoman kindWoman;

    public Wangpo(){
    }

    public Wangpo(KindWoman kindWoman){
        this.kindWoman = kindWoman;
    }


    @Override
    public void makeEyesWithMen() {
        this.kindWoman.makeEyesWithMen();
    }

    @Override
    public void playWithMen() {
        this.kindWoman.playWithMen();
    }
}
