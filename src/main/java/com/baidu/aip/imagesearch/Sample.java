package com.baidu.aip.imagesearch;

import com.baidu.aip.auth.Keys;
import com.baidu.aip.imageclassify.AipImageClassify;
import org.json.JSONObject;

import java.util.HashMap;

public class Sample {
    //设置APPID/AK/SK

    public static void main(String[] args) {
        // 初始化一个AipImageClassifyClient
        AipImageClassify client = new AipImageClassify(Keys.APP_ID,Keys.API_KEY, Keys.SECRET_KEY);

        // 可选：设置网络连接参数
        client.setConnectionTimeoutInMillis(2000);
        client.setSocketTimeoutInMillis(60000);


        String path = "C://test.jpg";
        HashMap<String, String> options = new HashMap<String, String>();
        options.put("baike_num", "5");
        String image = "C:/picture/7.jpg";
        JSONObject res = client.advancedGeneral(image, options);
        System.out.println(res.toString(2));

    }
}
