package com.itheima.service;

import com.itheima.pojo.Emp;
import com.itheima.pojo.EmpQueryParam;
import com.itheima.pojo.PageResult;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.util.List;

public interface EmpService {
//  分页查询
//  public PageResult<Emp> page(Integer page, Integer pageSize, String name, Integer gender, LocalDate begin, LocalDate end);
    public PageResult<Emp> page(EmpQueryParam empQueryParam);

    //新增接口
    void save(Emp emp);

    //删除接口
    void delete(List<Integer> ids);
}

















































