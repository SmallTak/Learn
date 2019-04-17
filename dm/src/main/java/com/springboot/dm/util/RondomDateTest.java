package com.springboot.dm.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import java.text.SimpleDateFormat;
import java.util.Date;

public class RondomDateTest {

    private static final String BEGINDATE = "2019-03-29";
    private static final String ENDDATE = "2019-03-30";

//    private static final String BEGINDATE = "2019-03-10";
//    private static final String ENDDATE = "2019-03-16";



    /**
     * 获取随机日期
     * @return
     */
    public Date randomDate(){
        try {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            Date start = format.parse(BEGINDATE);
            Date end = format.parse(ENDDATE);

            if(start.getTime() >= end.getTime()){
                return null;
            }

            long date = random(start.getTime(),end.getTime());

            return new Date(date);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static long random(long begin,long end){
        long rtn = begin + (long)(Math.random() * (end - begin));
        if(rtn == begin || rtn == end){
            return random(begin,end);
        }
        return rtn;
    }

}
