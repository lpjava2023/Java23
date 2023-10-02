package com.itheima.object.tostring;

import java.util.Objects;

public class Student {
    String name;
    int age;
    /**
     * 重写equals方法
     * */
    @Override
    public boolean equals(Object o) {
        //this:stu
        //o: stu1
        if (this == o){//判断两个对象的内存地址是否相同，如果相同，则内存地址也肯定一样直接返回true；
            return true;
        }
        //代码可以走到此处，代表地址一定不同
        //代码走到此处，代表stu一定不是null，如果stu.equal(xxx)会报错的——
        //stu不是null，stu1是null，就直接返回false

        //this.getClass() != o.getClass():两个对象的字节码是否相同——判断两个是否属于同一个类
        //如果字节码不同，说明类型不同，直接返回false
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }

        //代码走带此处，代表字节码相同，类型肯定相同
        //向下转型
        Student student = (Student) o;
        //比较
        return this.age == student.age && Objects.equals(this.name, student.name);
    }



    /**
 * 重写equals方法
 * */
//    @Override
//    public boolean equals(Object obj) {//Object obj = stu2;
//        //任意的类的父类都是Object,此处是为了防止不是Student的类混入
//        if(obj instanceof Student) {
//            //this:stu
//            //obj；stu1
//            /*
//             * 报错,多态编译会看成员中有无age，但是Object中，没有age，所以需要转型
//             * */
////        this.age == obj.age;
//            //向下转型的目的，是为了调用子类特有的成员
//            Student st = (Student) obj;
//            return this.age == st.age && this.name.equals(st.name);//此处的equals是String的equals
//        }else{
//            return false;
//        }
//    }




    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + "}";
    }
}
