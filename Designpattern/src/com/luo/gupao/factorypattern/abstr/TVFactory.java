package com.luo.gupao.factorypattern.abstr;

import com.luo.gupao.factorypattern.*;

public class TVFactory extends AbstractTVFactory {

    @Override
    public TV getLetvTV() {
        return new LETV();
    }

    @Override
    public TV getChangHongTV() {
        return new ChanghongTV();
    }

    @Override
    public TV getKonKaTV() {
        return new KonkaTV();
    }

    @Override
    public TV getHisenTV() {
        return new HisenTV();
    }
}
