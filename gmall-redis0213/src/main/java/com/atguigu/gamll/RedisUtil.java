package com.atguigu.gamll;

import com.sun.xml.internal.bind.v2.TODO;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPoolConfig;
import redis.clients.jedis.JedisSentinelPool;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Liya
 * @create 2020-07-19 21:14
 */
public class RedisUtil {
    public static void main(String[] args) {
        //Jedis jedis = new Jedis("hadoop102", 6381);
        //jedis.auth("123456");
        // System.out.println(jedis.ping());
        //  Set<String> keys = jedis.keys("*");
//        for (String key : keys) {
//            System.out.println(key);
//        }
//
//        jedis.set("k4", "v4");
//        jedis.set("k1", "v1");
//        //jedis.expire("k1",5);
//
//        List<String> l1 = jedis.lrange("l1", 0, -1);
//        System.out.println(l1);
//        for (String s : l1) {
//            System.out.println(s);
//        }
//        for (String key : keys) {
//            System.out.println(key);
//        }
        //jedis.close();
        Jedis jedis1 = new Jedis("hadoop102", 6379);

        System.out.println(jedis1.exists("k1"));

        Jedis jedis = RedisUtil.getJedis();
        jedis.set("k9999", "v9999");
        Set<String> keys = jedis.keys("*");
        for (String key : keys) {
            System.out.println(key);
        }
        jedis.close();
    }

    private static JedisSentinelPool jedisSentinelPool = null;   //TODO 懒加载

    public static Jedis getJedis() {
        if (jedisSentinelPool == null) {
            HashSet<String> sentinelSet = new HashSet<>();
            sentinelSet.add("192.168.219.102:26379");

            JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();

            jedisPoolConfig.setMaxTotal(10);//最大可用连接数
            jedisPoolConfig.setMaxIdle(5);//最大闲置连接数
            jedisPoolConfig.setMinIdle(5);//最小闲置连接数
            jedisPoolConfig.setBlockWhenExhausted(true);//连接耗尽是否等待
            jedisPoolConfig.setMaxWaitMillis(2000);//等待时间
            jedisPoolConfig.setTestOnBorrow(true);//取连接时是否进行一次测试ping pong

            jedisSentinelPool = new JedisSentinelPool("mymaster", sentinelSet, jedisPoolConfig);

            return RedisUtil.jedisSentinelPool.getResource();
        } else {
            return jedisSentinelPool.getResource();
        }
    }

}

