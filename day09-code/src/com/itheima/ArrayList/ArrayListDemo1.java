package com.itheima.ArrayList;
/*
            ArrayList集合的使用：
                细节：创建String，StringBuilder,ArrayList类的对象，打印对象名，都没有看到地址值，而是元素内容

                1.构造方法：
                        public ArrayList():创建一个空的集合容器

                2.集合容器的创建细节：
                     ArrayList list = new ArrayList();
                    现象：可以添加任意数据类型
                    弊端：数据不够严谨

                     ArrayList<String> list = new ArrayList<>();
                   <> : 泛型
                        目前:使用泛型，可以对集合中储存的数据，进行类型限制
                        细节：泛型中,不允许编制基本数据类型
                        使用基本数据类型，所对应的包装类
                                byte    Byte
                                short   Short
                                int     Integer
                                long    Long
                                float   Float
                                double  Double
                                boolean Boolean
                                char    Character
 */

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("吃大餐");
        list.add("长度");
        list.add("册");
        System.out.println(list);//输出结果:[吃大餐, 长度, 册]


        //步骤1：创建一个集合容器，内部存储 11.1 22.2 33.3
        ArrayList<Double> list1 = new ArrayList<>();
        list1.add(11.1);
        list1.add(22.2);
        list1.add(33.3);
        //步骤2：创建一个集合容器，内部存储 张三，李四，王五
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("张三");
        list2.add("李四");
        list2.add("王五");
        //步骤3：在控制台展示两个集合中的元素
        System.out.println(list1);//[11.1, 22.2, 33.3]
        System.out.println(list2);//[张三, 李四, 王五]
    }

}
