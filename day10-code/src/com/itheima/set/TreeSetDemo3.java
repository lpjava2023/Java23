package com.itheima.set;

import com.itheima.domain.Student;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo3 {public static void main(String[] args) {
    /*
        同时拥有比较器和自然排序，会优先按照比较器规则，进行排序操作
     */
    TreeSet<Student> sc = new TreeSet<>(new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            int ageresult = o1.getAge()- o2.getAge();
            return ageresult == 0 ? o1.getName().compareTo(o2.getName()) : ageresult;
        }
    });

    sc.add(new Student("赵六",26));
    sc.add(new Student("李四",24));
    sc.add(new Student("张三",23));
    sc.add(new Student("王五",25));

    System.out.println(sc);
}
}
