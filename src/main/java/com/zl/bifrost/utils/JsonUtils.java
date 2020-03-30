package com.zl.bifrost.utils;

import com.alibaba.fastjson.JSON;

/**
 * fastjson ustils
 *
 * @author zhangliang30
 */
public class JsonUtils {

    public static <T> T json2Obj(String json, Class<T> clazz) {
        if (json == null || json.isEmpty()) {
            return null;
        }
        try {
            return JSON.parseObject(json, clazz);
        } catch (Exception e) {
            return null;
        }
    }
}
