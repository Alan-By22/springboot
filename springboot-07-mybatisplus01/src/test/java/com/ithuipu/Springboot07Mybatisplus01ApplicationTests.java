package com.ithuipu;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ithuipu.dao.UserDao;
import com.ithuipu.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Springboot07Mybatisplus01ApplicationTests {


    /**
     * 注入dao
     */
    @Autowired
    private UserDao userDao;

    /**
     * 条件查询
     */
    @Test
    void testSelectAll() {
        /**方式一*/
        /*QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.lt("age",20);
        List<User> list = userDao.selectList(queryWrapper);
        System.out.println(list);*/

        /**方式二-2.lambda*/
       /* QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        //方法引用.避免字段写错的问题
        queryWrapper.lambda().lt(User::getAge, 20);   //lt < gt >
        List<User> list1 = userDao.selectList(queryWrapper);
        System.out.println(list1);*/

        /**3.lambda*/
        LambdaQueryWrapper<User> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.eq(User::getName,"Tom").gt(User::getAge,23);
        List<User> list = userDao.selectList(lambdaQueryWrapper);
        System.out.println(list);
    }


    /**
     * 查询
     */
    @Test
    void contextLoads() {
        List<User> list = userDao.selectList(null);
        System.out.println("查询:" + list);
    }

    /**
     * 根据id查询
     */
    @Test
    void selectById() {
        User user = userDao.selectById(1L);
        System.out.println("根据id查询:" + user);
    }

    /**
     * 添加
     */
    @Test
    void insert() {
        User user = new User();
        user.setName("赵六");
        user.setPassword("777");
        user.setAge(29);
        user.setId(5L);
        int insert = userDao.insert(user);
        System.out.println(insert);
    }


    /**
     * 根据id查询
     */
    @Test
    void updateById() {
        User user = new User();
        user.setId(5L);
        user.setName("赵六");
        user.setPassword("888");
        user.setAge(29);
        int i = userDao.updateById(user);
        System.out.println(i);
    }


    /**
     * 删除
     */
    @Test
    void deleteById() {
        int i = userDao.deleteById(5L);
        System.out.println(i);
    }


    /**
     * 分页查询
     */
    @Test
    public void selectByPage() {
        //分页
        //<E extends IPage<T>> E selectPage(E page, @Param(Constants.WRAPPER) Wrapper<T> queryWrapper);
        //需要插件--导入limit
        IPage<User> page = new Page<>(1, 2);
        userDao.selectPage(page, null);
        System.out.println("总记录数:" + page.getTotal());
        System.out.println("当前页数据的集合:" + page.getRecords());
    }

}
