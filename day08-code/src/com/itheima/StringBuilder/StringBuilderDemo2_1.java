package com.itheima.StringBuilder;

public class StringBuilderDemo2_1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println(sb);

        sb.append("红色");
        System.out.println(sb);

        sb.append("白色");
        System.out.println(sb);

        //输出结果：无  红色  红色白色

    }
}
