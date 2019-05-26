package com.epoint.gxtext;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 *  redis操作类 熟悉命令及操作
 *  [一句话功能简述]
 *  [功能详细描述]
 * @author GX
 * @version [版本号, 2019年3月29日]
 */
public class redistext
{
    public static void main(String[] args){
        //由于无集群，使用非切片客户端
        Jedis jedis;
        JedisPool jedisPool=null;
        //initialPool(jedisPool);
        JedisPoolConfig config = new JedisPoolConfig();
        config.setMaxIdle(5);
        config.setMaxWaitMillis(10001);
        config.setTestOnBorrow(false);
        jedisPool=new JedisPool(config,"10.10.112.112",6379);
        jedis = jedisPool.getResource();
        jedis.auth("Gepoint");
        //清空健
       System.out.println("新增键key001"+jedis.set("key001", "value001"));
       System.out.println("判断key001是否存在"+jedis.exists("key001"));
       //输出键值
       System.out.println("获取key001的值"+jedis.get("key001"));
    }
    
    //初始化连接池
    @SuppressWarnings("resource")
    public static void initialPool(JedisPool jedisPool){
        JedisPoolConfig config = new JedisPoolConfig();
        config.setMaxIdle(5);
        config.setMaxWaitMillis(10001);
        config.setTestOnBorrow(false);
        jedisPool=new JedisPool(config,"10.10.112.112",6379);
    }
}
