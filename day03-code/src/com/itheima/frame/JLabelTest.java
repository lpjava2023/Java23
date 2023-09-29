package com.itheima.frame;

import javax.swing.*;

public class JLabelTest {
    /*
        案例：使用JLabel展示文本和图片

        JLabel构造方法：
            JLabel(String text)使用指定的文本创建一个JLabel对象
            JLabel(Icon image)创建一个具有指定图像的JLabel对象
     */
    public static void main(String[] args) {
        JFrame frame =new JFrame();
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(null);

        //Jlabel展示文本
        JLabel jl1 = new JLabel("李鹏");

        jl1.setBounds(50,50,100,100);

        frame.getContentPane().add(jl1);

        //Jlabel展示图片
        //若两个重复则先写入的显示（多个组件摆放在同一位置，后添加的组件，会被压在底部）
//        ImageIcon icon = new ImageIcon("D:\\Advanced-Codes\\day03-code\\图片\\2.png");//此处多加了"\"是防止转义
//        JLabel imgLabel_2png = new JLabel(icon);
        JLabel imgLabel_2png = new JLabel(new ImageIcon("D:\\Advanced-Codes\\day03-code\\图片\\2.png"));
        imgLabel_2png.setBounds(50,150,100,100);
        frame.getContentPane().add(imgLabel_2png);

        frame.setVisible(true);
    }
}
