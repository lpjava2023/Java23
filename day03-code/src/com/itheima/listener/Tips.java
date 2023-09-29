package com.itheima.listener;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Tips {
    /*
        焦点：程序的注意力集中在某一个组件上

        注意：按钮组件比较特殊，在创建好之后，程序的焦点，默认就停留在按钮组件上面
            -按钮组件不需要占用程序的焦点
            -可以通过setFocusable(false);取消焦点
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JButton btn = new JButton("按钮");
        btn.setBounds(0,0,100,100);
        frame.getContentPane().add(btn);


        //------------------------------------------------

        btn.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("我被点到了");
            }
        });

        //取消焦点——防止行为监听和键盘监听在按空格时产生矛盾
        btn.setFocusable(false);

        //--------------------------------------------------

        frame.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("键盘按下");
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

        frame.setVisible(true);
    }
}
