package com.luo.gupao.factorypattern.factoryFunc;

import com.luo.gupao.factorypattern.KonkaTV;
import com.luo.gupao.factorypattern.TV;

public class KonkaTVTVFactory implements TVFactory {
    @Override
    public TV getTv() {
        return new KonkaTV();
    }
}
