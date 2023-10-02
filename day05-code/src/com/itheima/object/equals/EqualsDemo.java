package com.itheima.object.equals;

import com.itheima.object.tostring.Student;

import java.util.ArrayList;
import java.util.Objects;

public class EqualsDemo {
    /*
        Object类中的equals方法：

            public boolean equals(Object obj):对象之间进行比较，返回true，或者false

                     public boolean equals(Object obj) {
                        //this:stu
                        //obj:stu1
                        return (this == obj);//"=="比较的是数值
                     }

                    结论:Object类中的equals方法，默认比较的是对象内存地址
                            ——通常会重写equals方法，让对象之间进行内容比较

     */
    public static void main(String[] args) {
        Student stu = new Student("张三",21);
        Student stu1 = new Student("张三",21);
        System.out.println(stu.equals(stu1));


        System.out.println("-----------------------------------------------------");
        //问题:Object.equals方法，和stu.equals方法，有什么区别?
        //细节:Object.equals方法，内部依赖于我们自己所编写的equals
        //好处:Object.equals方法，内部有非空判断

        /*
                                       a:stu     b:stu1
        * public static boolean equals(Object a, Object b) {

             a == b,比较的是地址，若地址相同，就会返回true，这里使用的符号是"||",左边为true的话右边不会再执行，直接返回true
                        ——如果地址相同则直接返回true
          -----------------------------------------------------------------------------------------------
                       :如果地址不相同，则为false,则需要执行右边
          -----------------------------------------------------------------------------------------------
            a != null:假设a是null
                            null != null  :false
                            &&:左边为false，右边不会执行，右边不执行，记录null值的a，就不会调用equals方法——避免了空指针的异常
          -----------------------------------------------------------------------------------------------------
            a != null:假设a不是null
                            stu != null  :true
                            &&:左边为true,右边继续执行，a.equals(b)，这里就不会出现空指针异常

            return (a == b) || (a != null && a.equals(b));
        }
        * */

        System.out.println(Objects.equals(stu, stu1));

        Student stu2 = null;

        //若使用object.equals，会发生空指针异常，导致其它代码无法实行
//        System.out.println(stu2.equals(stu));
//        System.out.println("无法显示出来");

        //若使用objects.equals,内部有非空判断，会正常执行其它代码
        System.out.println(Objects.equals(stu2,stu));
        System.out.println("正常显示出来");

        System.out.println("-----------------------------------------------------");

        ArrayList<String> l =new ArrayList<>();
        System.out.println(stu.equals(l));



        System.out.println(stu.equals(stu1));

    }
}
