package com.itheima.jdk8.p7_Zone;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class ZoneldDemo {
    /*
            ZoneId类：时区类

     */
    public static void main(String[] args) {

        //获取Java中支持的所有时区
        Set<String> set = ZoneId.getAvailableZoneIds();
        System.out.println(set);//600个

        //获取系统默认时区
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);//Asia/Shanghai

        //获取一个指定的时区
        ZoneId of = ZoneId.of("Africa/Nairobi");
        System.out.println(of);//Africa/Nairobi

        ZonedDateTime zonedDateTime = Instant.now().atZone(of);
        System.out.println(zonedDateTime);//2023-10-05T18:14:08.342753100+03:00[Africa/Nairobi]


    }
}
