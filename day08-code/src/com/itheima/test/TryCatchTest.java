package com.itheima.test;

import com.itheima.domain.Student;
import com.itheima.exception.StudentAgeException;

import java.util.Scanner;

public class TryCatchTest {
    public static void main(String[] args) {
        Student stu = new Student();

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生姓名");
        String name = sc.nextLine();
        stu.setName(name);

        System.out.println("请输入学生年龄");
        int age= 0;
        while (true){
            try {
                age = Integer.parseInt(sc.nextLine());
//                age = sc.nextInt();
                stu.setAge(age);//StudentAgeException e= new StudentAgeException("输入年龄有误，请检查范围是否在0~120之间");
                break;
            } catch (NumberFormatException e) {
                System.out.println("输入错误，请重新输入");
            }catch (StudentAgeException e) {
                String message = e.getMessage();
                System.out.println(message);
            }
        }
        System.out.println(stu);

    }
}
