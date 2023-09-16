package com.itheima.Operator;

public class OperatorDmeo2 {
    /*
    自增自减运算:(只能操作变量)
        ++ 变量自身值+1
        -- 变量自身值-1

        1.单独使用:一句代码中，只做++，或者--
                    ++，--在变量前后，无区别

                        int a = 10;
                        a++;//a=a+1
                        ++a;
                        System.out.println(a);//12
        2.参与运算使用:
                        ++在前:先自增，再操作
                        ++在后:先操作，再自增

     */
    public static void main(String[] args) {
        int a = 10;
        a++;
        ++a;
        System.out.println(a);


        int b = ++a;
        System.out.println(a);
        System.out.println(b);//a=13;b=13
//        int b = a++;
//        System.out.println(a);
//        System.out.println(b);//a=13;b=12

    }
}
