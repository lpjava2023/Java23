package com.itheima.domain;

public class Student implements Comparable<Student>{
    private String name;
    private int age;

    // this.xxx - o.xxx  正序
    // o.xxx - this.xxx  降序
    @Override
    public int compareTo(Student o) {
        System.out.println(this.age+"----"+o.age);
        //根据年龄做主要的排序条件
        int ageresult = o.age-this.age;
        //根据姓名做次要的排序条件
        int nameresult = ageresult == 0 ? o.name.compareTo(this.name):ageresult;
        //判断姓名是否相同
        int result = nameresult == 0 ? 1:nameresult;

        return result;//正序
//      return o.age-this.age;//倒序
    }

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
