package com.luo.gupao.factorypattern.factoryFunc;


public class TVFactoryTest {
    public static void main(String[] args) {
        TVFactory tvFactory = new LetvTVFactory();
        System.out.println(tvFactory.getTv().getTVName());
    }
}
