package com.itheima.movies;

import java.util.Scanner;

public class ServiceMovie {

    private Scanner sc = new Scanner(System.in);
    private Movie[] movies;
    public ServiceMovie(Movie[] movies) {
        this.movies=movies;
    }

    public void start() {

        lo:
        while (true) {
            System.out.println("----------电影信息系统------------");
            System.out.println("请输入您的选择");
            System.out.println("1.查询全部电影信息");
            System.out.println("2.根据id查询电影信息");
            System.out.println("3.退出");
            int input = sc.nextInt();
            switch (input) {
                case 1:
                    palyMessage();//展示出电影信息
                    break;
                case 2:
                   findMessage();//根据id查询电影信息
                    break;
                case 3:
                    System.out.println("退出");
                    break lo;
                default:
                    System.out.println("输入错误，请重新输入:");
            }

        }
    }

    private void findMessage() {
        System.out.println("请输入你要查询电影的编号");
        int input =sc.nextInt();
        for(int i=0;i< movies.length;i++){
            Movie movie = movies[i];
            if(input== movie.getId()){
                System.out.println(movie.getId()+"---"+movie.getTitle()+"---"+movie.getTime()+"---"+movie.getScore()+"---"
                        +movie.getArea()+"---"+movie.getType()+"---"+movie.getDirector()+"---"+movie.getStarring());
                return;
            }
        }
        System.out.println("输入错误，请重新输入");
    }

    private void palyMessage() {
        for(int i=0;i<movies.length;i++){
            Movie movie=movies[i];
            System.out.println(movie.getTitle()+"-----"+movie.getId());
        }
    }
}
