package com.itheima.object.tostring;

public class ToStringDemo {
    /*
        public String toString()返回该对象的字符串表示

        public String toString(){
                return getClass().getName() + "@" + Integer.toHexString(hashCode());
        }

        getClass().getName():类名称，全类名(包名+类名)
        Integer.toHexString():转十六进制
        hashCode():返回的是对象内存地址+哈希算法，算出来的整数(哈希值)

        -----------------------------------------------------------------------------
        细节:使用打印语句，打印对象名的时候，println方法，源码层面，会自动调用该对象的toString方法
            public static String valueOf(Object obj) {
            return (obj == null) ? "null" : obj.toString();
            }
     */
    public static void main(String[] args) {
         A a = new A();
         //细节:使用打印语句，打印对象名的时候，println方法，源码层面，会自动调用该对象的toString方法
        System.out.println(a);//com.itheima.object.tostring.A@3b07d329
        System.out.println(a.toString());//com.itheima.object.tostring.A@3b07d329

        Student sc = new Student("李鹏",21);
        System.out.println(sc.toString());

    }
}
class A{

}