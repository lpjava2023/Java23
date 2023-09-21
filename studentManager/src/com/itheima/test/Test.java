package com.itheima.test;

import com.itheima.domain.Students;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        //增删改查都是围绕这个进行操作的
        AbstractList<Students> list = new ArrayList<>();


        Scanner sc = new Scanner(System.in);


        while (true) {
            System.out.println("--------------欢近来到学生管理系统-------------");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查看学生");
            System.out.println("5.退出");
            System.out.println("请输入您的选择");

            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    addStudent(list);
                    break;
                case 2:
                    deleteSutdentBuId(list);
                    break;
                case 3:
                    updateStudentInfoById(list);
                    break;
                case 4:
                    queryStudentInfos(list);
                    break;
                case 5:
                    System.out.println("感谢您的使用，再见！");
                    //终止正在运行的JVM虚拟机，建议写0，非0的状态码表示异常终止
                    System.exit(0);
                default:
                    System.out.println("您的输入有误，请重新输入");
            }
        }

    }

    /**
     * 添加学生
     * 键盘录入学生信息，封装为学生对象，存入集合
     * 学号的唯一性:getindex()方法，方法返回结果为-1，说明这个学号可以使用使用
     * */
    private static void addStudent(AbstractList<Students> list) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入学生学号:");

        String id = "";

        while(true){
            id = sc.next();

            int index = geyIndex(list, id);

            if(index==-1){
                //学号在集合中不存在，可以使用
                break;
            }else{
                System.out.println("您输入的学号已经被占用，请重新输入");
            }
        }

        System.out.println("请输入学生姓名:");
        String name = sc.next();
        System.out.println("请输入学号年龄");
        int i = sc.nextInt();
        System.out.println("请输入学生生日:");
        String birthday = sc.next();

        Students stu = new Students(id,name,i ,birthday);

        list.add(stu);

        System.out.println("添加成功!");

    }

/**
 * 根据学号修改集合中的学生信息
 *  修改学生
 *     键盘录入要修改的学生号String id;
 *     查找学生号在集合中的索引位置
 *     list.set(索引，新元素)
 * */
    private static void updateStudentInfoById(AbstractList<Students> list) {
        //1.键盘录入要修改的学生学号
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改的学生学号");
        String updateId=sc.next();
        //2.调用getIndex方法查找学号对应的索引
        int index = geyIndex(list,updateId);
        //3.如果学号不存在，给出错误提示
        if(index == -1){
            System.out.println("查无此人，修改失败!");
        }else{
            //4.如果学号存在，录入新的学生信息，完成修改
            System.out.println("请输入新的学生姓名");
            String name = sc.next();
            System.out.println("请输入新的学生年龄");
            int age = sc.nextInt();
            System.out.println("请输入新的学生生日");
            String birthday = sc.next();

            //将新录入的学生信息，封装为学生对象
            Students stu = new Students(updateId,name,age,birthday);
            list.set(index,stu);
            System.out.println("修改成功!");
        }
    }

    /**
 * 根据学号删除集合中的学生
 * 删除学生
 *     键盘录入要删除的学生号String id；
 *     查找学号在集合中的索引位置
 *     list.remove(索引)
 * */
    private static void deleteSutdentBuId(AbstractList<Students> list) {
        //1.键盘录入要删除的学生学号
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您要删除的学生学号");
        String id = sc.next();
        //2.调用getIndex方法，查找学号在集合中的索引
        int i = geyIndex(list,id);
        //3.判断方法的返回值是否为-1
        if(i==-1){
            //3.1是-1，说明学号不存在，给出错误提示
            System.out.println("查无此人，删除失败");
        }else {
            //3.2不是-1，说明学号存在，根据索引做删除
            list.remove(i);
            System.out.println("删除成功");
        }
    }


/**
 * 此方法根据学号，在集合中查找对应的索引
 * */
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

/**
 * 此方法用于查看学生
 * (先要判断集合中是否存在元素，list.size()==0)
 * */
    private static void queryStudentInfos(AbstractList<Students> list) {
        if(list.size()==0){
            System.out.println("查无信息，请添加后重试!");
        }else{
            System.out.println("学号:\t\t姓名:\t年龄:\t生日:");
            for (int i = 0; i < list.size(); i++) {
                Students stu = list.get(i);
                System.out.println(stu.getId()+"\t"+stu.getName()+"\t"+stu.getAge()+"\t"+stu.getBirthday());
            }
        }
    }
}
