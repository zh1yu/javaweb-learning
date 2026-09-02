package com.itheima.dao;

import java.util.List;

public interface UserDao {
    //这种接口内的函数只写函数声明，不写函数体内容，很像c++中的声明，具体的函数体内容在实现类中写
    public List<String> findAll();
}
