package com.jackxue.dao;

import com.jackxue.domain.User;
import com.jackxue.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserMapperTest {

    @Test
    public void test01(){
        SqlSession sqlSesion = MybatisUtils.getSqlSesion();
        UserMapper mapper = sqlSesion.getMapper(UserMapper.class);
        List<User> users = mapper.getUserList();
        for (User user : users) {
            System.out.println(user);
        }
        sqlSesion.close();
    }
    @Test
    public void addUser(){
        //获取sqlsession
        SqlSession sqlSesion = MybatisUtils.getSqlSesion();
        //获取mapper的实现类
        UserMapper mapper = sqlSesion.getMapper(UserMapper.class);
        //通过接口，多态的方式调用方法
        int ret = mapper.addUser(new User(4, "王祖贤", 43));
        if(ret > 0){
            System.out.println("插入成功！");
        }
        //提交事务 可以不用提交
        sqlSesion.commit();

        sqlSesion.close();
    }

    @Test
    public void updateUser(){
        //获取sqlsession
        SqlSession sqlSesion = MybatisUtils.getSqlSesion();
        //获取mapper的实现类
        UserMapper mapper = sqlSesion.getMapper(UserMapper.class);
        //通过接口，多态的方式调用方法
        int ret = mapper.updateUser(new User(4, "关之琳", 35));
        if(ret > 0){
            System.out.println("修改成功！");
        }
        //提交事务 可以不用提交
        //sqlSesion.commit();

        sqlSesion.close();
    }

    @Test
    public void delUser(){
        //获取sqlsession
        SqlSession sqlSesion = MybatisUtils.getSqlSesion();
        //获取mapper的实现类
        UserMapper mapper = sqlSesion.getMapper(UserMapper.class);
        //通过接口，多态的方式调用方法
        int ret = mapper.delUserById(4);
        if(ret > 0){
            System.out.println("删除成功！");
        }
        //提交事务 可以不用提交
        //sqlSesion.commit();

        sqlSesion.close();
    }
}
