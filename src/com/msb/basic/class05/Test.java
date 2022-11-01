package com.msb.basic.class05;

public class Test {
    public static void main(String[] args) {
        Gender gender = Gender.女;
        Gender gender2 = Gender.男;

        EventEnum launch = EventEnum.LAUNCH;
        EventEnum pageview = EventEnum.PAGEVIEW;
        EventEnum event = EventEnum.EVENT;
        System.out.println(launch.name());
        launch.show();
        launch.showAll();
    }
}
