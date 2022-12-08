package com.ithuipu;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ithuipu.dao.UserDao;
import com.ithuipu.pojo.User;
import com.ithuipu.pojo.UserVO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
class Springboot08Mybatisplus02ApplicationTests {


    /**
     * 注入dao
     */
    @Autowired
    private UserDao userDao;

    /**
     * 乐观锁--修改
     */
    @Test
    void contextLoads7() {
        //两个人AA BB操作
        /*User user1 = userDao.selectById(1L);
        user1.setName("AA");
        //2.
        userDao.updateById(user1);

        User user2 = userDao.selectById(1L);
        user2.setName("BB");
        //2.
        userDao.updateById(user2);*/

        //优化----------------------------------------------------
        User user1 = userDao.selectById(2L);
        User user2 = userDao.selectById(2L);

        //AA修改
        user1.setName("AA");
        userDao.updateById(user1);

        //BB修改
        user2.setName("BB");
        userDao.updateById(user2);
    }


    /**
     * 逻辑删除
     */
    @Test
    void contextLoads6() {
        /**逻辑删除*/
        //userDao.deleteById(6L);
        //2.查询
        //SELECT id,name,age,flag FROM t_user WHERE flag=0
        List<User> list = userDao.selectList(null);
        System.out.println(list);
    }



    /**
     * 批量操作
     */
    @Test
    void contextLoads5() {
        /**批量删除*/
        /*Long[] longs = {4L,5L};
        userDao.deleteBatchIds(Arrays.asList(longs));*/
        /**批量查询*/
        Long[] longs = {1L,2L};
        List<User> list = userDao.selectBatchIds(Arrays.asList(longs));
        System.out.println(list);
    }



    /**
     * 主键策略
     */
    @Test
    void contextLoads4() {
        //添加--测试主键策略
        User user = new User();
        user.setName("景宝");
        user.setAge(27);
        userDao.insert(user);
        //雪花算法生成的id
    }


    /**
     * 条件查询
     */
    @Test
    void contextLoads3() {
        //1.等值匹配
        /*LambdaQueryWrapper<User> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.eq(User::getName,"Jone").eq(User::getPassword,"123");*/

        //2.lt < le <= gt > ge >= between
        /*LambdaQueryWrapper<User> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.between(User::getAge,18,30);*/

        //3.like 模糊查询
        LambdaQueryWrapper<User> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.like(User::getName, "J");//%J%(String)
        //lambdaQueryWrapper.likeLeft(User::getName,"e");//以e结尾的搜素  %e(String)

        List<User> list = userDao.selectList(lambdaQueryWrapper);
        System.out.println(list);
    }


    /**
     * 空值的处理
     */
    @Test
    void contextLoads1() {
        //1.前台接收数据(name--age)
        User user = new User();
        user.setName("Jack");

        /*LambdaQueryWrapper<User> lambdaQueryWrapper = new LambdaQueryWrapper();
        lambdaQueryWrapper.eq(User::getName,user.getName()).eq(User::getAge,user.getAge());
        //2.查询
        List<User> list = userDao.selectList(lambdaQueryWrapper);
        System.out.println(list);*/

        /**优化一*/
       /* LambdaQueryWrapper<User> lambdaQueryWrapper = new LambdaQueryWrapper();
        if (user.getName() != null && user.getName().length() > 0) {
            lambdaQueryWrapper.eq(User::getName, user.getName());
        }
        if (user.getAge() != null) {
            lambdaQueryWrapper.eq(User::getAge, user.getAge());
        }*/

        LambdaQueryWrapper<User> lambdaQueryWrapper = new LambdaQueryWrapper<User>();
        //判定第一个条件的值,如果为true---拼接条件---如果为false--不会拼接
        lambdaQueryWrapper.eq(user.getName() != null, User::getName, user.getName())
                .eq(user.getAge() != null, User::getAge, user.getAge());

        //2.查询
        List<User> list = userDao.selectList(lambdaQueryWrapper);
        System.out.println(list);
    }

    /**
     * 空值的处理
     */
    @Test
    void contextLoads2() {
        UserVO userVO = new UserVO();
        userVO.setUage(18);
        userVO.setAge(30);
        //问题:根据年龄的范围来查询?如何判断
        //判定第一个条件的值,如果为true---拼接条件---如果为false--不会拼接
        //lambdaQueryWrapper.lt(User::getAge,30).gt(User::getAge,18);age < ? AND age > ?
        //lambdaQueryWrapper.lt(User::getAge,30).or().gt(User::getAge,18);//age < ? OR age > ?

        //方法一
        /*QueryWrapper<User> queryWrapper = new QueryWrapper<User>();
        queryWrapper.lt(userVO.getAge() != null, "age", userVO.getAge())
                .gt(userVO.getUage() != null, "age", userVO.getUage());
        //2.查询
        List<User> list = userDao.selectList(queryWrapper);
        System.out.println(list);*/

        LambdaQueryWrapper<User> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.lt(userVO.getAge() != null, User::getAge, userVO.getAge())
                .gt(userVO.getUage() != null, User::getAge, userVO.getUage());
        List<User> list = userDao.selectList(lambdaQueryWrapper);
        System.out.println(list);
    }


}
