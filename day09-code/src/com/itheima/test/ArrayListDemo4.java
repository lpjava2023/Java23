package com.itheima.test;
/*
        需求:创建一个存储String的集合，内部存储(teat,张三，李四，test，test)字符串
                删除所有的test字符串，删除后，将集合剩余元素打印在控制台
 */

import java.util.ArrayList;

public class ArrayListDemo4 {
    public static void main(String[] args) {


        ArrayList<String> list = new ArrayList<>();
        list.add("test");
        list.add("张三");
        list.add("李四");
        list.add("test");
        list.add("test");
        System.out.println(list);//[test, 张三, 李四, test, test]

        extracted(list);


        extracted1(list);


        extracted2(list);

        extracted3(list);


    }

    /**
     * 正确方法2
     * */
    private static void extracted3(ArrayList<String> list) {
        for (int i = list.size()-1; i>=0; i--) {
            String s = list.get(i);
            if ("test".equals(s)){
                list.remove(i);
            }
        }
        System.out.println(list);// [张三, 李四]
    }

    /**
     * 正确方法1
     * */
    private static void extracted2(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if ("test".equals(s)){
                list.remove(i);
                i--;
                //因为每删除一个集合里的元素，集合会重新填充删除元素后的位置
                System.out.println(list.size());//4 3 2
            }
        }
        System.out.println(list);// [张三, 李四]
    }


    /**
     * 会剩余一个test，因为每删除一个集合里的元素，集合会重新填充删除元素后的位置
     * */
    private static void extracted1(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            //这样会报错
//        String ss =null;
//        System.out.println(ss.equals("test"));
          //所以建议将变量写在里面
            if ("test".equals(s)){
                list.remove(i);
            }
        }
        System.out.println(list);//输出结果[张三, 李四, test]
    }

    /**
     * 只能删除第一个test
     * */
    private static void extracted(ArrayList<String> list) {
        list.remove("test");
        System.out.println(list);//[张三, 李四, test, test]
    }
}
