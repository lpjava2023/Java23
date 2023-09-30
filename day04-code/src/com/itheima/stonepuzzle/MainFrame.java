package com.itheima.stonepuzzle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

//继承窗体
public class MainFrame extends JFrame implements KeyListener {

    int row ;//0号元素行坐标位置
    int column ;//0号元素列坐标位置
    int count;

    int[][] data = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,0}
    };
    int[][] win ={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,0}
    };

    public MainFrame(){

        //窗体对象.addKeyListener();
        //this:当前类对象
        //1)窗体对象
        //2)KeyListener实现类对象
        this.addKeyListener(this);

        //初始化窗体
        initFrame();
        //初始化数据
        initData();
        //绘制游戏界面
        paintView();
        //窗体可视化
        setVisible(true);
    }

    /**
     * 此方法用于初始化窗体
     */
    public void initFrame(){
//        JFrame frame = new JFrame();
        //设置窗体大小
        setSize(514,595);
        //设置窗体关闭模式
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //设置窗体标题
        setTitle("石头迷阵单机版V1.0");
        //显示在屏幕最上层
        setAlwaysOnTop(true);
        //设置窗体居中显示
        setLocationRelativeTo(null);
        //取消窗体默认布局
        setLayout(null);
    }
    /**
     * 初始化数据(打乱二维数组)
     */
    public void initData(){
        //准备Random对象
        Random r = new Random();
        //遍历二维数组，获取每一个元素
        for(int i = 0;i<data.length;i++){
            for (int j = 0; j < data[i].length; j++) {
                int X = r.nextInt(4);
                int Y = r.nextInt(4);
                int temp = data[i][j];
                data[i][j]=data[X][Y];
                data[X][Y]=temp;
            }
        }
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if(data[i][j]==0){
                    row=i;
                    column=j;
                }
            }
        }
        System.out.println(row);
        System.out.println(column);
    }

    /**
 * 判断游戏是否胜利
 * */
    public boolean victory(){
        /*
        * 将其创建在外面，就不用每一次创建数组
        * */
//        int[][] win ={
//                {1,2,3,4},
//                {5,6,7,8},
//                {9,10,11,12},
//                {13,14,15,0}
//        };
        for (int j = 0; j < data.length; j++) {
            for (int i = 0; i < data[j].length; i++) {
                if(data[j][i]!=win[j][i]){
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * 此方法用于绘制游戏界面
     */
    public void paintView(){

        //清空
        getContentPane().removeAll();

        if(victory()) {
            //加载胜利图片，添加到窗体中——若添加到清空前面会被清空
            JLabel win = new JLabel(new ImageIcon("D:\\Advanced-Codes\\day03-code\\图片\\win.png"));
            win.setBounds(124,230,260,88);
            getContentPane().add(win);
        }

        JLabel text = new JLabel("步数为"+count);
        text.setBounds(50,20,100,20);
        getContentPane().add(text);

        JButton btn = new JButton("重新开始");
        btn.setBounds(350,20,100,20);
        getContentPane().add(btn);
        btn.setFocusable(false);
        btn.addActionListener(e -> {
            count =0;
            initData();
            paintView();
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                count =0;
//                initData();
//                paintView();
//            }
        });


        for(int j = 0;j < 4; j++){
            for (int i = 0; i < 4; i++) {
                JLabel imageLabel = new JLabel(new ImageIcon("D:\\Advanced-Codes\\day03-code\\图片\\"+data[j][i]+".png"));
                imageLabel.setBounds(50+100*i,90+100*j,100,100);
                //此处MainFrame继承了JFrame，所以也继承了它的方法，就可以直接写——相当于自身有此方法
                getContentPane().add(imageLabel);
            }
        }


        JLabel background = new JLabel(new ImageIcon("D:\\Advanced-Codes\\day03-code\\图片\\background.png"));
        background.setBounds(26,30,450,484);
        getContentPane().add(background);

        //面板刷新
        getContentPane().repaint();
    }



    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        move(keyCode);
        //每次移动之后，都需要重新绘制游戏桌面
        paintView();
    }

    /**
     * 此方法用于处理移动业务
     * */
    private void move(int keyCode) {
        if(victory()){
            return;
        }
        if (keyCode == 37) {
            if(column==3){
                return;
            }
           //左移——空白块和右边的块交换位置
            //data[row][column] data[row][column+1]
            int temp = data[row][column];
            data[row][column]=data[row][column+1];
            data[row][column+1]=temp;
            column++;
            count++;
        } else if (keyCode == 38) {
            if(row==3){
                return;
            }
            //上移——空白块和下面的块交换位置
            //data[row][column] data[row+1][column]
            int temp =data[row][column];
            data[row][column]=data[row+1][column];
            data[row+1][column]=temp;
            row++;
            count++;
        } else if (keyCode == 39) {
            if(column==0){
                return;
            }
            //右移——空白块和左边的块交换位置
            //data[row][column] data[row][column-1]
            int temp =data[row][column];
            data[row][column]=data[row][column-1];
            data[row][column-1]=temp;
            column--;
            count++;
        } else if (keyCode == 40) {
            if(row==0){
                return;
            }
           //下移——空白块和上面的块交换位置
            //data[row][column] data[row-1][column]
            int temp =data[row][column];
            data[row][column]=data[row-1][column];
            data[row-1][column]=temp;
            row--;
            count++;
        }else if(keyCode == 90){
            //触发作弊器
            data=new int[][]{   //不能用简化格式，只能这样
                    {1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,0}
            };
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

}
