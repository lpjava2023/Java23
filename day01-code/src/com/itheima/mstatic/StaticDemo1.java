package com.itheima.mstatic;

public class StaticDemo1 {
    /*
        static 关键字：修饰符，可以修饰成员变量，成员方法

        特点：
            1.被类的所有对象共享
            2.多了一种调用方式，可以通过类名进行调用(建议使用类名调用)
            3.随着类的加载而加载，优先于对象存在

            注意事项:
                static方法中，只能访问静态成员(指的是直接访问)
                static中不允许使用this关键字(都没有new对象)
     */
    public static void main(String[] args) {

        Student.school = "创智专修学院";

        Student stu1 = new Student();
        stu1.name = "张三";
        stu1.age = 23;
        //stu1.school = "创智专修学院";

        System.out.println(stu1.name+"----"+stu1.age+"----"+Student.school);


        System.out.println("---------------------------------------------");//张三----23----创智专修学院


        Student stu2 = new Student();
        stu2.name = "李四";
        stu2.age = 24;
//        stu2.school =  "创智专修学院";
        System.out.println(stu2.name+"----"+stu2.age+"----"+Student.school);//李四----24----创智专修学院


        Student stu3 = new Student();
        System.out.println(stu3.name+"----"+stu3.age+"----"+Student.school);//null----0----创智专修学院
    }
}
