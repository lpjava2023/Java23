package com.itheima.collection;

import com.itheima.domain.Student;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest1 {
    /*
      Collection——接口的常用方法 :

          public boolean add(E e) : 把给定的对象添加到当前集合中
          public void clear() : 清空集合中所有的元素
          public boolean isEmpty() : 判断当前集合是否为空
          public boolean remove(E e) : 把给定的对象在当前集合中删除
          public boolean contains(Object obj) : 判断当前集合中是否包含给定的对象
          public int size() : 返回集合中元素的个数(集合的长度)
   */
    public static void main(String[] args) {

        Collection<Student> c = new ArrayList<>();
        c.add(new Student("张三",23));
        c.add(new Student("李四",24));
        c.add(new Student("王五",25));

        //此处使用remove和contains(添加的元素是对象)需要重写对象类equals方法，才可以显示正确结果——因为new会新创建一个对象
        boolean b = c.contains(new Student("李四", 24));
        System.out.println(b);
        c.remove(new Student("李四",24));
        System.out.println(c);

        System.out.println(c);//[Student{name = 张三, age = 23}, Student{name = 李四, age = 24}, Student{name = 王五, age = 25}]
    }

    private static void menthodeTest() {
        //以多态的形式创建集合对象，调用单列集合中共有的方法
        Collection<String> c = new ArrayList<>();

        c.add("张三");
        c.add("李四");
        c.add("王五");

        System.out.println(c.size());

        System.out.println(c.contains("李四"));

        c.remove("张三");
        System.out.println(c);

        System.out.println(c.isEmpty());
        System.out.println(c);

        c.clear();
        //   return size == 0;是分配了内存，长度是否为零
        //c=null,是list不存在，未分配空间，若用isEmpty会出现空指针异常
        System.out.println(c.isEmpty());
        System.out.println(c);
    }
}
