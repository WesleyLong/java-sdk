package com.baidu.aip.contentcensor;

import com.baidu.aip.auth.Keys;

import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        AipContentCensor a = new AipContentCensor(Keys.APP_ID,Keys.API_KEY,Keys.SECRET_KEY);
        List<String> list = new ArrayList<String>();
        list.add("C:/picture/7.jpg");
        System.out.println(a.faceAudit(list,EImgType.FILE,null));

    }
}
