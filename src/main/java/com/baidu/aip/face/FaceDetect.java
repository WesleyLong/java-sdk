package com.baidu.aip.face;

import com.baidu.aip.auth.Keys;
import com.baidu.aip.util.GsonUtils;
import com.baidu.aip.util.HttpUtil;

import java.util.HashMap;
import java.util.Map;

public class FaceDetect {
    private static void detect() {
        // 请求url
        String url = "https://aip.baidubce.com/rest/2.0/face/v3/detect";
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("image", "027d8308a2ec665acb1bdf63e513bcb9");
            map.put("face_field", "faceshape,facetype");
            map.put("image_type", "FACE_TOKEN");

            String param = GsonUtils.toJson(map);

            // 注意这里仅为了简化编码每一次请求都去获取access_token，线上环境access_token有过期时间， 客户端可自行缓存，过期后重新获取。
            String accessToken = Keys.accessToken;

            HttpUtil.post(url, accessToken, "application/json", param);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        FaceDetect.detect();
    }
}

