package com.itheima.stonepuzzle;

import javax.swing.*;

public class Test {
    public static void main(String[] args) {

        //创建一个二维数组
        int[][] data = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,0}
        };

        JFrame frame = new JFrame();
        //设置窗体大小
        frame.setSize(514,595);
        //设置窗体关闭模式
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //设置窗体标题
        frame.setTitle("石头迷阵单机版V1.0");
        //显示在屏幕最上层
        frame.setAlwaysOnTop(true);
        //设置窗体居中显示
        frame.setLocationRelativeTo(null);
        //取消窗体默认布局
        frame.setLayout(null);

        for(int j = 0;j < 4; j++){
            for (int i = 0; i < 4; i++) {
                JLabel imageLabel = new JLabel(new ImageIcon("D:\\Advanced-Codes\\day03-code\\图片\\"+data[j][i]+".png"));
                imageLabel.setBounds(50+100*i,90+100*j,100,100);
                frame.getContentPane().add(imageLabel);
            }
        }

//
//        JLabel jl2 = new JLabel(new ImageIcon("D:\\Advanced-Codes\\day03-code\\图片\\8.png"));
//        jl2.setBounds(50+100*1,90,100,100);
//        frame.getContentPane().add(jl2);
//
//        JLabel jl3 = new JLabel(new ImageIcon("D:\\Advanced-Codes\\day03-code\\图片\\8.png"));
//        jl3.setBounds(50+100*2,90,100,100);
//        frame.getContentPane().add(jl3);
//
//        JLabel jl4 = new JLabel(new ImageIcon("D:\\Advanced-Codes\\day03-code\\图片\\8.png"));
//        jl4.setBounds(50+100*3,90,100,100);
//        frame.getContentPane().add(jl4);
        /**
        for (int i = 0; i < 4; i++) {
            JLabel jl5= new JLabel(new ImageIcon("D:\\Advanced-Codes\\day03-code\\图片\\8.png"));
            jl5.setBounds(50+100*i,90+100*1,100,100);
            frame.getContentPane().add(jl5);
        }
         */
//        JLabel jl5= new JLabel(new ImageIcon("D:\\Advanced-Codes\\day03-code\\图片\\8.png"));
//        jl5.setBounds(50,190,100,100);
//        frame.getContentPane().add(jl5);
//
//        JLabel jl6 = new JLabel(new ImageIcon("D:\\Advanced-Codes\\day03-code\\图片\\8.png"));
//        jl6.setBounds(150,190,100,100);
//        frame.getContentPane().add(jl6);
//
//        JLabel jl7 = new JLabel(new ImageIcon("D:\\Advanced-Codes\\day03-code\\图片\\8.png"));
//        jl7.setBounds(250,190,100,100);
//        frame.getContentPane().add(jl7);
//
//        JLabel jl8 = new JLabel(new ImageIcon("D:\\Advanced-Codes\\day03-code\\图片\\8.png"));
//        jl8.setBounds(350,190,100,100);
//        frame.getContentPane().add(jl8);
        /**
        for (int i = 0; i < 4; i++) {
            JLabel jl5= new JLabel(new ImageIcon("D:\\Advanced-Codes\\day03-code\\图片\\8.png"));
            jl5.setBounds(50+100*i,90+100*2,100,100);
            frame.getContentPane().add(jl5);
        }
         */
//        JLabel jl9 = new JLabel(new ImageIcon("D:\\Advanced-Codes\\day03-code\\图片\\8.png"));
//        jl9.setBounds(50,290,100,100);
//        frame.getContentPane().add(jl9);
//
//        JLabel jl10 = new JLabel(new ImageIcon("D:\\Advanced-Codes\\day03-code\\图片\\8.png"));
//        jl10.setBounds(150,290,100,100);
//        frame.getContentPane().add(jl10);
//
//        JLabel jl11 = new JLabel(new ImageIcon("D:\\Advanced-Codes\\day03-code\\图片\\8.png"));
//        jl11.setBounds(250,290,100,100);
//        frame.getContentPane().add(jl11);
//
//        JLabel jl12 = new JLabel(new ImageIcon("D:\\Advanced-Codes\\day03-code\\图片\\8.png"));
//        jl12.setBounds(350,290,100,100);
//        frame.getContentPane().add(jl12);
        /**
        for (int i = 0; i < 4; i++) {
            JLabel jl5= new JLabel(new ImageIcon("D:\\Advanced-Codes\\day03-code\\图片\\8.png"));
            jl5.setBounds(50+100*i,90+100*3,100,100);
            frame.getContentPane().add(jl5);
        }
        */
//        JLabel jl13 = new JLabel(new ImageIcon("D:\\Advanced-Codes\\day03-code\\图片\\8.png"));
//        jl13.setBounds(50,390,100,100);
//        frame.getContentPane().add(jl13);
//
//        JLabel jl14 = new JLabel(new ImageIcon("D:\\Advanced-Codes\\day03-code\\图片\\8.png"));
//        jl14.setBounds(150,390,100,100);
//        frame.getContentPane().add(jl14);
//
//        JLabel jl15 = new JLabel(new ImageIcon("D:\\Advanced-Codes\\day03-code\\图片\\8.png"));
//        jl15.setBounds(250,390,100,100);
//        frame.getContentPane().add(jl15);
//
//        JLabel jl16 = new JLabel(new ImageIcon("D:\\Advanced-Codes\\day03-code\\图片\\8.png"));
//        jl16.setBounds(350,390,100,100);
//        frame.getContentPane().add(jl16);

        /*
        * 此处将背景放在组件后面
        *   ——因为组件都是一层一层的，后放的会在底层显示，所以背景要后添加
        * */
        JLabel background = new JLabel(new ImageIcon("D:\\Advanced-Codes\\day03-code\\图片\\background.png"));
        background.setBounds(26,30,450,484);
        frame.getContentPane().add(background);


        //设置窗体可见——放在最后
        frame.setVisible(true);
    }
}
