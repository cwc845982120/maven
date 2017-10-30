package cn.springmvc.util;

import java.util.Map;

import com.alibaba.fastjson.JSON;

/**
 * @author caowencheng
 * @version 1.0.0
 * @description
 * @date 2017-10-30 21:49
 **/

public class JsonUtils {


    @SuppressWarnings("unchecked")
    public static Map<String, Object> json2Map(String json) {
        return JSON.parseObject(json, Map.class);
    }

    public static String obj2JsonString(Object obj) {
        return JSON.toJSONString(obj);
    }

}
