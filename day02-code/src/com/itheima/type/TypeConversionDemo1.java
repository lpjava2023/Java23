package com.itheima.type;

public class TypeConversionDemo1 {
    /*
    隐式转换
    介绍：将取值范围小的数或变量，给取值范围大的变量，可以直接赋值
        简单记:小的给大的，可以直接给
        取值范围大小：
                    byte->short(char)->int->long->float->double
                    问题:float占用4个字节,为啥放在了long的后面
                     解释:虽然float占用4个字节，但是但是取值范围要比8个自己的龙更大
                                小数的二进制存储形式，更节省内存


     运算过程中的隐式转换
     1.取值范围小的数据，和取值范围大的数据进行运算，小的会先提升为大的之后，再进行运算
     2.byte short char 三种数据在运算时，都会提升为int，再进行运算



     强制转换
        介绍:把一个取值范围大的数值或者变量，赋值给一个取值范围小的变量，不能直接赋值，需要强制转化、换
        格式:目标数据类型  变量名 = (目标数据类型) 被强转的数据
        注意:可能产生精度损失
     */
    public static void main(String[] args) {
        int a = 10;
        double b =a;
        System.out.println(a);//10
        System.out.println(b);//10.0

        long num1 = 123L;
        float num2 = num1;
        System.out.println(num1);
        System.out.println(num2);//  隐式转换


        int c = 10;
        double d = 12.3;
        double e =c+d;//取值范围小的数据，和取值范围大的数据进行运算，小的会先提升为大的之后，再进行运算

        byte aa = 10;
        byte bb = 20;
        //byte cc =aa+ bb典型错误(byte short char 三种数据在运算时，都会提升为int，再进行运算)
        int cc = aa+ bb;// 运算过程中的隐式转换


        double aaa = 12.3;
        int bbb = (int)aaa;
        System.out.println(bbb);//强制转换

        int num = 130;
        byte nums= (byte) num;
        System.out.println(nums);//产生精度损失,输出为-126
        //0 0 0 100000010
        // 100000010的原码-126


    }
}
