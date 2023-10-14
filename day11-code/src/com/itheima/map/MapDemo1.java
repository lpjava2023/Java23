package com.itheima.map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {
    /*
        Map集合常用API

            ---------------------------------------------------------------------------
            public V put(K key,V value)		           添加元素 (修改: 如果键已经存在了, 就会使用新值, 替换旧值)
                                                            - 返回被覆盖掉的旧值.
            public V remove(Object key)		           根据键删除键值对元素
                                                            - 返回被删除的键, 所对应的值
            public void clear()			               移除所有的键值对元素
            public boolean containsKey(Object key)     判断集合是否包含指定的键
            public boolean containsValue(Object value) 判断集合是否包含指定的值
            public boolean isEmpty()		           判断集合是否为空
            public int size()			               集合的长度，也就是集合中键值对的个数
            ---------------------------------------------------------------------------

     */
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("张三", "北京");
        map.put("李四", "北京");
        map.put("王五", "上海");

        System.out.println(map);

        map.remove("王五");

        System.out.println(map);

        System.out.println(map.isEmpty());      // false
        System.out.println(map.size());         // 2

        System.out.println(map.containsKey("张三"));      // true
        System.out.println(map.containsValue("上海"));    // false

        map.clear();

    }
}
