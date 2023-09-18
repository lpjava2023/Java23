package com.itheima.test;

import com.itheima.domain.movie;

public class Test {
    public static void main(String[] args) {
        //同一类型，可以通过数组来存储
        movie movie1 = new movie(1,"东八区的先生们","2022",2.1,"中国大陆","剧情 喜剧","夏瑞","张翰 王晓成");
        movie movie2 = new movie(2,"上海堡垒","2019",2.9,"中国大陆","爱情 战争 科幻","滕华涛","鹿晗 舒淇");
        movie movie3 = new movie(3,"纯洁心灵 逐梦演艺圈","2015",2.2,"中国大陆","剧情 喜剧","毕志飞","朱怡雯 李艳慢");

        //int[] arr = {11,22,33}
        movie[] movies = {movie1,movie2,movie3};
        for (int i=0;i< movies.length;i++){
            System.out.println(movies[i]);
            //打印出:
            // om.itheima.domain.movie@3b07d329
            //com.itheima.domain.movie@41629346
            //com.itheima.domain.movie@404b9385
        }

        /**
         * 该如何将一个类中的数据，传递给另一个类
         * */
        MovieService  movieService = new MovieService(movies);
        movieService.start();


    }

}
