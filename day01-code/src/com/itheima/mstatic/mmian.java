package com.itheima.mstatic;

public class mmian {

    public static void main(String[] args) {
        /*
        public:  被JVM调用，访问权限足够大
        static:  被JVM调用，不用创建对象
                 因为main方法是静态的，所以测试类中其他方法也需要静态(在main方法中去调用其他方法，其他方法也要为静态的——因为静态的方法中只能直接访问静态的)
        void:    被JVM调用，不需要黑JVM返回值
        main     一个通用的名称，虽不是关键字，但JVM只认它
        String[] args:  以前用于键盘录入数据，现在没用
         */
    }
}
