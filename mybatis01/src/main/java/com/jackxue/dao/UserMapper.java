package com.jackxue.dao;

import com.jackxue.domain.User;
import jdk.nashorn.internal.objects.annotations.Where;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    //查询所有用户
    List<User> getUserList();

    //插入一个新的用户
    int addUser(User user);

    //修改一个用户
    int updateUser(User user);

    //通过注解的方式来删除指定id的用户
    @Delete("delete from user where id  = #{id}")
    int delUserById(@Param("id") int id2);

}
