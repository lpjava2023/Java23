package com.itheima.String;

public class StringSum {
    /*
        String类中用于比较的方法：
        public boolean equals(object anobject)将此字符串与指定的对象比较
        public boolean equalsIgnoreCase(String anotherString)将此String与另一个String比较，不考虑大小写

        String类用于遍历的方法
        public char[] toCharArry()将此字符转换为一个新的字符数组
        public char CharAt(int index)返回指定索引处的char值

        public String substring(int beginIndex,int endIndex)截取
           注意点：包头不包尾，包左不包右
           只有返回值才是截取的小串
        public Stringsubstring(int beginIndex) 截取到末尾

        String类的替换方法：
        public String replace(CharSequence target, Char Sequence replacement):
                                  参数一：旧值             参数二：新值
        注意点：返回值才是替换之后的结果

        String类的切割方法：
            public String[] split(String regex):根据传入的字符作为规则，切割当前字符
        建议：先正常制定切割规则，后来发现没有得到自己要的效果，就可以尝试在前面加入"\\"
 */
}
