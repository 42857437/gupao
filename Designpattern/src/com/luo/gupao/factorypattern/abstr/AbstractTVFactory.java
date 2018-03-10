package com.luo.gupao.factorypattern.abstr;

import com.luo.gupao.factorypattern.TV;

public abstract class AbstractTVFactory {

    //乐视电视
    public abstract TV getLetvTV();

    //长虹电视
    public abstract TV getChangHongTV();

    //康佳电视
    public abstract TV getKonKaTV();

    //海信电视
    public abstract  TV getHisenTV();



}
