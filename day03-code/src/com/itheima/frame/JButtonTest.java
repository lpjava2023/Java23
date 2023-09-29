package com.itheima.frame;

import javax.swing.*;

public class JButtonTest {
    /*
        案例演示：长体重添加按钮组件
        -----------------------------------
        JButton构造方法：
                    1.public JButton():创建一个空白的按钮
                    2.public JButton(String text):创建一个带文本的按钮
        ----------------------------------------
        注意：如果取消了窗体的默认布局，就需要手动指定组件的摆放位置
     */
    public static void main(String[] args) {
        JFrame fram = new JFrame();
        fram.setSize(500,500);
        fram.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //取消窗体的默认布局,需要重新布局
        fram.setLayout(null);

        //1.创建按钮对象
        JButton btn = new JButton("李鹏");

        //按钮重新布局
        btn.setBounds(50,50,100,100);
        fram.setVisible(true);

        //2.将按钮添加到窗口（面板对象）中
        fram.getContentPane().add(btn);

    }
}
