package com.itheima.mapper;

import com.itheima.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper  //应用程序在启动时，会自动为该接口创建一个实现类对象（代理对象）
// 且会存入IOC容器中-bean
public interface UserMapper {

    //查询操作
    @Select("select * from user")
    public List<User> findAll();

    //删除操作
    @Delete("delete from user where id=#{id}")
    public Integer deleteById(Integer id);

    //插入操作
    @Insert("insert into user (id,username,password,name,age) values (#{id},#{username},#{password},#{name},#{age})")
    public void insert(User user);

    //修改操作
    @Update("update user set username=#{username},password=#{password},name=#{name},age=#{age} where id=#{id}")
    public void update(User user);

    //查找操作
    @Select("select * from user where username=#{username} and password=#{password}")
    public User findByUsernameAndPassword(@Param("username") String username, @Param("password") String password);
    //在spring框架可以不加注解@Param
}
