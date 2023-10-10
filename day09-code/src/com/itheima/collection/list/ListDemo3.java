package com.itheima.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo3 {
    /*
        并发修改异常：ConcurrentModificationException
            场景：使用[迭代器]遍历集合的过程中，调用了[集合对象]的添加或者删除方法，就会出现此现象
            解决方法：迭代器的遍历过程中，不允许使用集合对象的添加或者删除，那就使用迭代器，自己添加或者删除方法
                    普通的迭代器只有删除方法，若要添加一个元素，需要用ListIterator
     */
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("000");
        list.add("111");
        list.add("222");
        list.add("333");

        ListIterator<String> it = list.listIterator();

        while (it.hasNext()){
            String next = it.next();
            if("000".equals(next)){
               it.remove();
               it.add("444");
            }
            System.out.println(next);//输出为000 111 222 333——此处的删除是在集合中删除了"000",但是"000"还存在，只是不在集合中而已
        }
        System.out.println(list);
    }
}
