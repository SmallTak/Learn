package com.interfac.text.demo.utils;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URL;

public class Token {

    public static String getToken(){

        try {
            // 传入参数
            URL url = new URL();
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            // 在连接之前设置属性

            // Content-Type实体头用于向接收方指示实体的介质类型，指定HEAD方法送到接收方的实体介质类型，或GET方法发送的请求介质类型
            conn.setRequestProperty("Content-Type", "application/json; charset=utf-8");
            // 设置打开与此URLConnection引用的资源的通信链接时使用的指定超时值（以毫秒为单位）
            conn.setConnectTimeout(10000);
            // 将读取超时设置为指定的超时时间，以毫秒为单位。
            // conn.setReadTimeout(60000);
            conn.setRequestMethod("GET");
            // Post 请求不能使用缓存
            conn.setUseCaches(false);
            conn.addRequestProperty("key", "123");
            // 建立连接
            conn.connect();
            // 获取响应
            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line;
            String result = "";
            while ((line = reader.readLine()) != null) {
                result += line;
            }
            reader.close();
            conn.disconnect();
            return result;
        } catch (MalformedURLException e) {

            e.printStackTrace();
        } catch (SocketTimeoutException e) {

            e.printStackTrace();
        } catch (IOException e) {

            e.printStackTrace();
        }

        return null;

    }

}
