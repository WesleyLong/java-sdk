package com.baidu.aip.face;

import com.baidu.aip.auth.Keys;
import com.baidu.aip.util.Base64Util;
import com.baidu.aip.util.FileUtil;
import org.json.JSONObject;

import java.io.IOException;
import java.util.HashMap;

public class Demo {

    public static void main(String[] args) {
        // 初始化一个AipFace
        AipFace client = new AipFace(Keys.APP_ID,Keys.API_KEY,Keys.SECRET_KEY);

        // 可选：设置网络连接参数
        client.setConnectionTimeoutInMillis(2000);
        client.setSocketTimeoutInMillis(60000);

        // 可选：设置代理服务器地址, http和socket二选一，或者均不设置
//        client.setHttpProxy("proxy_host", proxy_port);  // 设置http代理
//        client.setSocketProxy("proxy_host", proxy_port);  // 设置socket代理

        // 可选：设置log4j日志输出格式，若不设置，则使用默认配置
        // 也可以直接通过jvm启动参数设置此环境变量
//        System.setProperty("aip.log4j.conf", "path/to/your/log4j.properties");

        // 调用接口
        String image = "";
        try {
            image = Base64Util.encode(FileUtil.readFileByBytes("C:\\picture\\ugirls\\34ce5ee48a05e1df3d587f1aa76cf570.jpg.jpg"));
        } catch (IOException e) {
            System.out.println("读取图片文件出错");
            e.printStackTrace();
        }
        String imageType = "BASE64";
        //人脸识别
        HashMap<String, String> options = new HashMap<String, String>();
        JSONObject res = client.detect(image, imageType,options);
        System.out.println(res.toString(2));

        //人脸注册
//        HashMap<String, String> options1 = new HashMap<String, String>();
//        options1.put("user_info", "user's info");
//        options1.put("quality_control", "NORMAL");
//        options1.put("liveness_control", "LOW");
//        String imageType = "BASE64";
//        String groupId = "group1";
//        String userId = "user6";
//        JSONObject res1 = client.addUser(image, imageType, groupId, userId, options1);
//        System.out.println(res1.toString(2));

        // 人脸搜索
//        HashMap<String, String> options2 = new HashMap<String, String>();
//        options2.put("quality_control", "NORMAL");
//        options2.put("liveness_control", "LOW");
////        options2.put("user_id", "user1");
//        options2.put("max_user_num", "3");
//        String groupIdList = "group1";
//        JSONObject res = client.search(image, imageType, groupIdList, options2);
//        System.out.println(res.toString(2));

        // 人脸更新
//        HashMap<String, String> options3 = new HashMap<String, String>();
//        options3.put("user_info", "user's info");
//        options3.put("quality_control", "NORMAL");
//        options3.put("liveness_control", "LOW");
//        String groupId = "group1";
//        String userId = "user1";
//        JSONObject res3 = client.updateUser(image, imageType, groupId, userId, options3);
//        System.out.println(res3.toString(2));
    }
}
