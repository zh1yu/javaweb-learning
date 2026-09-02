package com.itheima.controller;

import cn.hutool.core.io.IoUtil;
import com.itheima.pojo.User;
import com.itheima.service.UserService;
import com.itheima.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

//@RestController
//public class UserController {
//    @RequestMapping("/list")
//    public List<User> list() throws Exception{
//        //1.加载并读取user.txt文件，获取用户数据
//        //常用的读取文件方法
//        InputStream in = getClass().getClassLoader().getResourceAsStream("user.txt");
//        ArrayList<String> lines=IoUtil.readLines(in, StandardCharsets.UTF_8, new ArrayList<>());
//
//        //2.解析用户信息，封装为User对象->list集合
//        //lambda表达式
//        List<User> userList=lines.stream().map(line->{
//            String[] parts = line.split(",");
//            Integer id=Integer.parseInt(parts[0]);
//            String username=parts[1];
//            String password=parts[2];
//            String name=parts[3];
//            Integer age=Integer.parseInt(parts[4]);
//            LocalDateTime updateTime= LocalDateTime.parse(parts[5], DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
//            return new User(id, username, password, name,age, updateTime);
//        }).toList();
//
//        //3.返回数据（json）
//        return userList;
//    }
//}

@RestController
public class UserController {

    @Autowired     //指定类型注解
    //@Resource(name="UserServiceImpl")   指定类名注解
    private UserService userService;

    @RequestMapping("/list")
    public List<User> list() throws Exception{
        List<User> userList = userService.list();
        //3.返回数据（json）
        return userList;
    }
}

