package com.itheima.map;

import java.util.*;

public class MapTest2 {
    public static void main(String[] args) {

        HashMap<String, List<String>> hm = new HashMap<>();

        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1, "南京市", "扬州市", "苏州市", "无锡市", "常州市");
        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2, "武汉市", "孝感市", "十堰市", "宜昌市", "鄂州市");
        ArrayList<String> list3 = new ArrayList<>();
        Collections.addAll(list3, "成都市", "绵阳市", "自贡市", "攀枝花市", "泸州市");

        hm.put("江苏省", list1);
        hm.put("湖北省", list2);
        hm.put("四川省", list3);

        Set<Map.Entry<String, List<String>>> entrySet = hm.entrySet();

        for (Map.Entry<String, List<String>> entry : entrySet) {
            // 键: 省份名称
            String key = entry.getKey();
            System.out.print(key + "=");
            // 值: 多个市名
            List<String> list = entry.getValue();
            for (int i = 0; i < list.size() - 1; i++) {
                System.out.print(list.get(i) + ", ");
            }
            System.out.println(list.get(list.size() - 1));
        }

    }
}
