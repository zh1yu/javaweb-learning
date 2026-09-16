package com.itheima.mapper;

import com.itheima.pojo.EmpExpr;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

//员工工作经历Mapper接口
@Mapper
public interface EmpExprMapper {
    //批量保存员工经历
    void insertBatch(List<EmpExpr> exprList);
}
