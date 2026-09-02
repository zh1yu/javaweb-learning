package com.itheima;

import com.itheima.mapper.UserMapper;
import com.itheima.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringbootMybatisQuickstartApplicationTests {
    @Autowired
    private UserMapper userMapper;

    //测试查询
    @Test
    public void testFindAll(){
        List<User> userList = userMapper.findAll();
        userList.forEach(System.out::println);
    }


    //测试删除
    @Test
    public void testDeleteById(){
        Integer i=userMapper.deleteById(5);
        System.out.println("删除的条数："+i);
    }

    //测试插入
    @Test
    public void testInsert(){
        User user = new User(null,"zhouyu","123456","周瑜",28);
        userMapper.insert(user);
    }

    //测试更新
    @Test
    public void testUpdate(){
        User user = new User(1,"zhouyu","123456","周瑜",28);
        userMapper.update(user);
    }

    //测试查找
    @Test
    public void testFindById(){
        User user = userMapper.findByUsernameAndPassword("diaochan","123456");
        System.out.println(user);
    }
}
