import redis.clients.jedis.Jedis;

/**
 * @className: JedisDemo
 * @author: Mr.BingYu
 * @description:
 * @date: 2023/01/11 16:15
 **/


public class JedisDemo {
    public static void main(String[] args) {
        //1.创建jedis
        Jedis jedis = new Jedis("192.168.61.4",6379);
        //2.String
        jedis.set("name","hanxue");
        //3.关闭连接
        jedis.close();
    }
}
