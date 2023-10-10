package com.itheima.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {
    /*
        List接口的特点 : 存取有序, 有索引, 可以存储重复的

        和索引有关的API :

            public void add(int index, E element) : 在指定的索引位置, 添加元素
            public E remove(int index) : 根据索引删除集合中的元素
            public E set(int index, E element) : 根据索引修改集合中的元素
            public E get(int index) : 返回指定索引处的元素
     */
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("张三");

        list.add(0,"小二");
        System.out.println(list);

        list.remove(4);
        System.out.println(list);

        list.set(0,"周二");
        System.out.println(list);

        System.out.println(list.get(0));

        System.out.println("---------------------------------------");

        List<Integer> s = new ArrayList<>();

        s.add(111);     // Integer e = 111;
        s.add(222);
        s.add(333);

        //删除元素222

        //错误方法
        //list.remove(222);//此处的删除的是索引所指的地方，会报错

        //若是Integer类型的，删除元素时应该手动装箱，不然会将输入的数字当做索引进行删除，会出现错误
        //正确方法
        s.remove(Integer.valueOf(222));
        System.out.println(s);

    }
}
