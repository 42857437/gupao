package com.luo.gupao.factorypattern.factoryFunc;

import com.luo.gupao.factorypattern.LETV;
import com.luo.gupao.factorypattern.TV;

public class LetvTVFactory implements TVFactory {

    @Override
    public TV getTv() {
        return new LETV();
    }
}
