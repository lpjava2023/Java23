package com.itheima.map;

import java.util.TreeMap;
import java.util.function.BiConsumer;

public class MapTest1 {
    public static void main(String[] args) {
        String info = "ababc";

        // 1. 准备map集合, 用于统计字符的次数
        TreeMap<Character, Integer> tm = new TreeMap<>();

        // 2. 拆分字符串
        char[] charArray = info.toCharArray();

        // 3. 遍历字符数组, 获取每一个字符
        for (char c : charArray) {
            // 4. 判断当前字符在集合中是否存在
            if (!tm.containsKey(c)) {
                // 不存在: 说明是第一次出现
                tm.put(c, 1);
            } else {
                // 存在: 说明不是第一次出现, 获取旧值 + 1存回去
                tm.put(c, tm.get(c) + 1);
            }
        }

        // 5. 准备StringBuilder
        StringBuilder sb = new StringBuilder();
        tm.forEach((key, value) -> sb.append(key).append("(").append(value).append(")"));

        System.out.println(sb);
    }
}
