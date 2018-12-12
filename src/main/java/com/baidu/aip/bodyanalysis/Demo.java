package com.baidu.aip.bodyanalysis;

import com.baidu.aip.auth.Keys;

import java.util.HashMap;

public class Demo {

    public static void main(String[] args) {
        AipBodyAnalysis a = new AipBodyAnalysis(Keys.APP_ID,Keys.API_KEY,Keys.SECRET_KEY);
        HashMap<String, String> options = new HashMap<String, String>();
        System.out.println(a.bodyAnalysis("C:/picture/7.jpg",options));

    }
}
