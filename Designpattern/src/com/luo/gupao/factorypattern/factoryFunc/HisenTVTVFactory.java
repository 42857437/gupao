package com.luo.gupao.factorypattern.factoryFunc;

import com.luo.gupao.factorypattern.ChanghongTV;
import com.luo.gupao.factorypattern.TV;

public class HisenTVTVFactory implements TVFactory {
    @Override
    public TV getTv() {
        return new ChanghongTV();
    }
}
