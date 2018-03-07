package com.zking;

import redis.clients.jedis.Jedis;

import java.util.List;

/**
 * @author: longyt
 * @create: 2018-03-03 11:03
 * @desc:
 **/
public class RedisTest {

    public static void main(String[] args) {

        Jedis jedis=new Jedis("192.168.152.128");

        System.out.println(jedis.ping());

        System.out.println("ping 成功");

        jedis.lpush("testlist","longyt");
        jedis.lpush("testlist","19");

        List<String> testlist = jedis.lrange("testlist", 0, 10);

        for (String s : testlist) {
            System.out.println(s);
        }


    }
}
