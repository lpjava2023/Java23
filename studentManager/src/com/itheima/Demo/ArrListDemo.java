package com.itheima.Demo;

import com.itheima.domain.Students;

import java.util.AbstractList;
import java.util.ArrayList;

public class ArrListDemo {
    public static void main(String[] args) {
        ;

        Students stu1 = new Students("heima001","张三",23,"2020-1-1");
        Students stu2 = new Students("heima002","李四",24,"2020-1-2");
        Students stu3 = new Students("heima003","王五",25,"2020-1-3");

        AbstractList<Students> list = new ArrayList<>();

        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        String id = "heima001";

        int index = geyIndex(list,id);
        System.out.println(index);

    }

    private static int geyIndex(AbstractList<Students> list, String id) {
        //1.遍历集合，获取到每一个学生对象
        for (int i = 0; i < list.size(); i++) {
            Students stu = list.get(i);
            //stu.getId():从集合中取出的学生学号
            //id:要查找的学号
            //2.对比
            if(stu.getId().equals(id)){
                //找到了，返回正确的索引
                return i;
            }
        }
        //4.没找到，返回-1
        return  -1;
    }
}
