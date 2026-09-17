package com.itheima.mapper;

import com.itheima.pojo.Emp;
import com.itheima.pojo.EmpQueryParam;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Mapper;

import java.time.LocalDate;
import java.util.List;


//原始方式分页
//员工信息Mapper接口
//@Mapper
//public interface EmpMapper {
//    //查询总记录数
//    @Select("select count(*) from emp e left join dept on e.dept_id=dept.id")
//    public Long count();
//
//    //分页查询
//    //给d.name起别名，是为了封装到Emp对象的deptName属性中
//    @Select("select e.*,d.name deptName from emp e left join dept d on e.dept_id=d.id " +
//            "order by e.update_time desc limit #{start},#{pageSize}")
//    public List<Emp> list(Integer start, Integer pageSize);

//PageHelper分页
@Mapper
public interface EmpMapper {
//    @Select("select e.*,d.name deptName from emp e left join dept d on e.dept_id=d.id order by e.update_time desc")
    public List<Emp> list(EmpQueryParam empQueryParam);

    //新增操作
    //sql语句不复杂，可以通过注解完成
    @Options(useGeneratedKeys = true, keyProperty = "id") //获取到生成的主键，并设置到emp对象的id属性中
    @Insert("insert into emp (username,name,gender,phone,job,salary,image,entry_date,dept_id,create_time,update_time) " +
            "values (#{username},#{name},#{gender},#{phone},#{job},#{salary},#{image},#{entryDate},#{deptId},#{createTime},#{updateTime})")
    void insert(Emp emp);

    //删除操作
    //根据ID删除
    void deleteByIds(List<Integer> ids);

}


















