package com.itheima.service;
import com.itheima.pojo.Dept;
import org.springframework.stereotype.Service;

import java.util.List;

public interface DeptService {
    /**
     * 查询全部部门数据
     */
    public List<Dept> findAll();

    /**
     * 根据ID删除部门数据
     */
    void deleteById(Integer id);

    /**
     * 添加部门数据
     */
    void insert(Dept dept);

    /**
     * 根据ID查询部门数据
     */
    Dept getById(Integer id);

    /**
     * 根据ID修改部门数据
     */
    void update(Dept dept);
}
