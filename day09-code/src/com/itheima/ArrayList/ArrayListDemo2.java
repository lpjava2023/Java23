package com.itheima.ArrayList;
/*
    AeeayList 常用成员方法：
        1.增:
                public boolean add(E e):将指定的元素添加到列表的尾部
                public void add(int index, E element):在指定索引位置，添加对应元素

        2.删：
                public E remove(int index0):根据索引作做删除，返回被删除的元素
                public boolean remove(object o)：根据元素作删除，返回是否删除成功的状态

        3.改：
                public E set(int index,E element):修改指定索引为，为对应的元素，返回被覆盖的元素
                ------------------------------------------------------------------
                以上方法，返回值通常不做接收
        4.查
                 public E get(int index):根据索引，获取集合中的元素
 */

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {
       //1.
        ArrayList<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");

        list.add(0,"李鹏");
        list.add(4,"李鹏");
//        list.add(8,"cecw");会报错，不能超过其长度
        System.out.println(list);//[李鹏, 张三, 李四, 王五, 李鹏]



        //2.
        String remove = list.remove(0);
        System.out.println(remove);//李鹏
        System.out.println(list);//[张三, 李四, 王五, 李鹏]


        boolean flag = list.remove("李鹏");
        System.out.println(list);//[张三, 李四, 王五]

        //3.
        String result = list.set(1, "李鹏");
        System.out.println(result);//李四
        System.out.println(list);//[张三, 李鹏, 王五]

        //4.
        String s = list.get(1);
        System.out.println(s);//李鹏
    }
}
