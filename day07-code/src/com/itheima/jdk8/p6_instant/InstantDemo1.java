package com.itheima.jdk8.p6_instant;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class InstantDemo1 {
    /*
        Instant类：用于表示时间的对象，类似之前所学习的Date
     */
    public static void main(String[] args) {

        Instant now = Instant.now();
        //此刻的时间:2023-10-05T14:57:34.092243400Z——真实时间时间22:59:34(因为我们所处东八区)
        System.out.println("此刻的时间:"+now);

        ZonedDateTime zonedDateTime = Instant.now().atZone(ZoneId.of("Asia/Shanghai"));//S大写
        System.out.println(zonedDateTime);

    }
}
