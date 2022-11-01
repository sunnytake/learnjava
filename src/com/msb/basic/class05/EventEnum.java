package com.msb.basic.class05;

public enum EventEnum {

    LAUNCH("launch"), PAGEVIEW("pageview"), EVENT("event");

    private String name;

    EventEnum(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println(this.name);
    }

    public void showAll(){
        EventEnum[] values = values();
        for(int i=0; i<values.length; i++){
            System.out.println(values[i]);
        }
    }
}
