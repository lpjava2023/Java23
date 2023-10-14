package com.itheima.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class MapDemo3 {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();
        hm.put("张三", "北京");
        hm.put("李四", "上海");
        hm.put("王五", "成都");

        hm.forEach((key, value) -> System.out.println(key + "---" + value));

        hm.forEach((k,v) -> System.out.println(k + "---" + v));


    }

    private static void method2(HashMap<String, String> hm) {
        // 1. 获取到所有的键值对对象
        Set<Map.Entry<String, String>> entrySet = hm.entrySet();
        // 2. 遍历set集合获取每一个键值对对象
        for (Map.Entry<String, String> entry : entrySet) {
            // 3. 通过键值对对象, 获取键和值
            System.out.println(entry.getKey() + "---" + entry.getValue());
        }
    }

    private static void method1(HashMap<String, String> hm) {
        // 1. 获取到所有的键
        Set<String> keySet = hm.keySet();
        // 2. 遍历set集合, 获取每一个键
        for (String key : keySet) {
            // 3. 调用map集合的get方法, 根据键查找对应的值
            String value = hm.get(key);
            System.out.println(key + "---" + value);
        }
    }
}
