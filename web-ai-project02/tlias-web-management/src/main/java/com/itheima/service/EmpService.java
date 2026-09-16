package com.itheima.service;

import com.itheima.pojo.Emp;
import com.itheima.pojo.EmpQueryParam;
import com.itheima.pojo.PageResult;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;

public interface EmpService {
    //分页查询
//    public PageResult<Emp> page(Integer page, Integer pageSize, String name, Integer gender, LocalDate begin, LocalDate end);
    public PageResult<Emp> page(EmpQueryParam empQueryParam);

    //新增
    void save(Emp emp);
}

















































