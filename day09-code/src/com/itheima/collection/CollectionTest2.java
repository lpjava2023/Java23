package com.itheima.collection;

import com.itheima.domain.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

public class CollectionTest2 {
    /*
          public Iterator<E> iterator();获取遍历集合的迭代器

          public E next():从集合中获取一个元素——next方法会将元素取出，并将指针向后移动一位
          next()方法调用过多会出现异常——NoSuchElementException
          注意在循环中next方法最好只调用一次


          public boolbean hasNext();如果仍有元素可以迭代，则返回true（判断指针处有无元素，起初为0）


     */
    public static void main(String[] args) {

        Collection<Student> c = new ArrayList<>();

        c.add(new Student("张三",23));
        c.add(new Student("李四",24));
        c.add(new Student("王五",25));


        /**
         * 迭代器遍历*/

        //Iterator是接口        那么此处的c.iterator()会调用出一个Iterator的实现类
        //1.获取迭代器
        Iterator<Student> it = c.iterator();

        //2.循环判断，集合中是否还有元素
        while (it.hasNext()){//判断指针处有无元素,起初为0

            //3.调用next()方法，将元素取出
            Student stu = it.next();//——next方法会将元素取出，并将指针向后移动一位
            System.out.println(stu);



            // 注意在循环中next方法最好只调用一次
//            //Student stu = it.next();
//            System.out.println(it.next().getName()+it.next().getName());//会报错
        }


//        while (true){
//            try {
//                Student s1 = it.next();
//                System.out.println(s1);
//            } catch (Exception e) {
//                break;//抓到了，就结束
//            }
//        }

//        Student s2 = it.next();
//        System.out.println(s2);
//
//        Student s3 = it.next();
//        System.out.println(s3);

//        Student s4 = it.next();
//        System.out.println(s4);//输出异常NoSuchElementException

        System.out.println("---------------------------------------------------------------");

        //使用增强for循环遍历集合-底部基于迭代器
        for (Student s : c) {
            System.out.println(s);
        }

        System.out.println("---------------------------------------------------------------");

        //foreach方法遍历集合(-底部基于迭代器)——里面的参数是个接口，所以用匿名内部类，又因为接口为函数式接口可以用lambda
        c.forEach(s -> System.out.println(s));


    }
}
