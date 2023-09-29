package com.itheima.listener;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyListenerTest {
    /*
        键盘事件：KeyLidtener
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        frame.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                if(keyCode == 37){
                    System.out.println("左");
                }else if(keyCode == 38){
                    System.out.println("上");
                }else if(keyCode == 39){
                    System.out.println("右");
                }else if(keyCode == 40){
                    System.out.println("下");
                }
//                System.out.println(keyCode);

//                System.out.println("键盘按下了...");
            }

            @Override
            public void keyReleased(KeyEvent e) {
//                System.out.println("键盘松开了...");
            }
        });
        frame.setVisible(true);
    }
}
