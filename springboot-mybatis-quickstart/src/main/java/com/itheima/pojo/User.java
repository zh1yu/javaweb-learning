package com.itheima.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class User {
    private Integer id;
    private String username;
    private String password;
    private String name;
    private Integer age;
}
