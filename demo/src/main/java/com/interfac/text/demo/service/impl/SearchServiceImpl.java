package com.interfac.text.demo.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.interfac.text.demo.controller.exception.NotFountException;
import com.interfac.text.demo.service.SearchService;
import com.interfac.text.demo.utils.GetDate;
import com.interfac.text.demo.utils.Token;
import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;
import org.junit.Test;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.Set;

@Service
public class SearchServiceImpl implements SearchService {

    @Override
    public void findUserByNameAndCard(String userNc) {
        String userName = userNc.substring(0,userNc.length() - 18);
        String userCard = userNc.substring(userNc.length() - 18, userNc.length());
        String data = GetDate.getDate(userCard , userName);
        JSONObject jsonObject = JSON.parseObject(data);
        if (jsonObject.get("resultData") == null){
            throw new RuntimeException("该身份证不存在");
        } else {
            JSONObject outJson  = JSONObject.parseObject(data);
            Set<String> jsonSet = outJson.keySet();
            Iterator<String> iterator = jsonSet.iterator();
            //通过迭代器可以取到外部json的key
            String json = iterator.next();
            //取得内部json字符串
            String string = outJson.getString(json);
            //将内部json字符串解析为object对象
            JSONObject inJson = JSONObject.parseObject(string);
            //通过score，得到value值
            String score = inJson.getString("popName");
            System.out.println(score);
            if (!score.equals(userName)){
                throw new RuntimeException("姓名与身份证号不匹配");
            }
            System.out.println(score);

        }

    }

//    @Test
//    public void  home(){
//        String userNc = "周云辉412723199511025931";
//        String userName = userNc.substring(0,userNc.length() - 18);
//        String userCard = userNc.substring(userNc.length() - 18, userNc.length());
//
//        String handUrl = "http://59.227.162.33:4888/http/getRkMessVerificationByIdCard?idCard=";
//        String url = handUrl + userCard + "&" + "userName=" + userName;
//
//        System.out.print(url);
//
//    }
//
//    @Test
//    public void test(){
//
//        String token = Token.getToken();
//        System.out.println(token);
//
//        JSONObject jsonObject = JSON.parseObject(token);
//        System.out.print(jsonObject.get("access_token"));
//
//    }
//
//    @Test
//    public void r(){
//
//        String data = GetDate.getDate("412723199511025931", "周云辉");
//        JSONObject jsonObject = JSON.parseObject(data);
//        System.out.println(jsonObject.get("resultData"));
//        Object resultData = jsonObject.get("resultData");
//        JSONObject outJson  = JSONObject.parseObject(data);
//        Set<String> jsonSet = outJson.keySet();
//        Iterator<String> iterator = jsonSet.iterator();
//        //通过迭代器可以取到外部json的key
//        String json = iterator.next();
//        //取得内部json字符串
//        String string = outJson.getString(json);
//        //将内部json字符串解析为object对象
//        JSONObject inJson = JSONObject.parseObject(string);
//        //通过score，得到value值
//        String score = inJson.getString("popName");
//        System.out.println(score);
//
//
//
//    }

}

