package com.luo.gupao.factorypattern.abstr;

public class AbstractTVTest {
    public static void main(String[] args) {
        AbstractTVFactory abstractTVFactory = new TVFactory();
        System.out.println(abstractTVFactory.getChangHongTV().getTVName());
    }
}
