package com.itheima.controller;

import com.itheima.pojo.Dept;
import com.itheima.pojo.Result;
import com.itheima.service.DeptService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    //查询全部部门数据
    //@RequestMapping(value = "/depts",method = RequestMethod.GET)
    @GetMapping("/depts")  //只能get请求，等价于@RequestMapping(value = "/depts",method = RequestMethod.GET)
    public Result list(){
//        System.out.println("查询全部部门数据");
        log.info("查询全部部门数据");
        List<Dept> deptList=deptService.findAll();
        return Result.success(deptList);
    }

    //根据ID删除部门数据
    //方式3：省略@RequestParam注解
    //但该形参名要与URL路径中的占位符名称一致
    @DeleteMapping("/depts")
    public Result delete(Integer id){
//        System.out.println("根据ID删除部门数据："+id);
        log.info("根据ID删除部门数据：{}",id);
        deptService.deleteById(id);
        return Result.success();
    }

    //新增部门
    @PostMapping("/depts")
    public Result add(@RequestBody Dept dept){
//        System.out.println("新增部门："+dept);
        log.info("新增部门：{}",dept);
        deptService.insert(dept);
        return Result.success();
    }

    //根据ID查询部门数据
    @GetMapping("/depts/{id}")
    public Result getById(@PathVariable Integer id){
//        System.out.println("根据ID查询部门数据："+id);
        log.info("根据ID查询部门数据：{}",id);
        Dept dept=deptService.getById(id);
        return Result.success(dept);
    }

    //根据ID修改部门数据
    @PutMapping("/depts")
    public Result update(@RequestBody Dept dept){
//        System.out.println("根据ID修改部门数据："+dept);
        log.info("根据ID修改部门数据：{}",dept);
        deptService.update(dept);
        return Result.success();
    }

}





















