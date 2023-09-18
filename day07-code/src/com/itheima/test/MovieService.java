package com.itheima.test;

import com.itheima.domain.movie;

import java.util.Scanner;

public class MovieService {
    private Scanner sc = new Scanner(System.in);

    /**
     * 因为movies在构造方法中属于局部变量,只能在构造方法中使用，需要创建一个全局变量
     * */
    private movie[] movies;//全局的movies
    public MovieService(movie[] movies) {
        this.movies=movies;
//        for(int i=0;i< movies.length;i++)
//            System.out.println(movies[i]);
    }

    /**
     * 启动电影信息管理系统
     */
    public void start() {



        lo:
        while (true) {
            System.out.println("----------电影信息系统------------");
            System.out.println("请输入您的选择");
            System.out.println("1.查询全部电影信息");
            System.out.println("2.根据id查询电影信息");
            System.out.println("3.退出");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    queryMovieInfos();
                    break;
                case 2:
                    queryMovieInfoById();
                    break;
                case 3:
                    System.out.println("感谢您的使用，再见");
                    break lo;
                default:
                    System.out.println("您的输入有误，请重新输入");
                    break;
            }
        }
    }
    /**
     * 根据电影编号，查询电影详情
     * */
    private void queryMovieInfoById() {
        //1.键盘录入用户输入的编号
        System.out.println("请输入您要查询的编号：");
        int id = sc.nextInt();
        //2.遍历数组找出电影对应的ID号和用户输入的比较，然后从数组中查询电影信息
        for (int i=0;i<movies.length;i++){
            movie movie = movies[i];
            if(movie.getId()==id){
                //3.将找到的电影信息打印出来
                System.out.println(movie.getId()+"---"+movie.getTitle()+"---"+movie.getTime()+"---"+movie.getScore()+"---"
                        +movie.getArea()+"---"+movie.getType()+"---"+movie.getDirector()+"---"+movie.getStarring());
                /*return 是结束方法;break 是结束循环或者switch语句*/
                return;
            //    break;
            }
        }
        //执行到此处说明不存在
        System.out.println("您输入的不存在，请检查输入！");
    }

    /**
     * 展示系统中全部的电影(名称，评分)
     * */
    private void queryMovieInfos() {
        //1.遍历数组，取出每一个电影对象
        for(int i=0;i<movies.length;i++){
            movie movie = movies[i];
            //System.out.println(movie);打印出的是所对应的地址
            //2.通过电影对象，调用内部getXxx,获取信息并打印
            System.out.println(movie.getTitle()+"---"+movie.getScore());
        }
    }
}
