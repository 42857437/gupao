package com.luo.gupao.factorypattern.simple;

import com.luo.gupao.factorypattern.ChanghongTV;
import com.luo.gupao.factorypattern.KonkaTV;
import com.luo.gupao.factorypattern.LETV;
import com.luo.gupao.factorypattern.TV;

public class TvFactory {
    public TV GetName(String tvName){
        if("乐视".equals(tvName)){
            return new LETV();
        }else if("长虹".equals(tvName)){
            return new ChanghongTV();
        }else if("康佳".equals(tvName)){
            return new KonkaTV();
        }else{
            System.out.println("不支持生产的电视品牌:"+tvName);
            return  null;
        }


    }
}
