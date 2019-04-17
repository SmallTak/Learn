package com.springboot.dm.util;

public class Rondom {

//    public String sy = "首页";
//    public String xydt = "信用动态";
//    public String xyyj = "信用研究";
//    public String zcfg = "政策法规";
//    public String xyfw = "信用服务";
//    public String hyxy = "行业信用";
//    public String xygs = "信用公示";
//    public String zxzl = "专项治理";
//    public String lhjc = "联合奖惩";
//    public String dxal = "典型案例";



    public int getRondom(){

        int iRandom = (int)( 1 + Math.random()*10);
        return iRandom;

    }

}
