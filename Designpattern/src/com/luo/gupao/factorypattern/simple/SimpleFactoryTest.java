package com.luo.gupao.factorypattern.simple;

public class SimpleFactoryTest {
    public static void main(String[] args) {
      TvFactory tvFactory =new TvFactory();
        System.out.println(tvFactory.GetName("小米").getTVName());

    }
}
