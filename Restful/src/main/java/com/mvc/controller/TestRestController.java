package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.sql.SQLOutput;

/**
 * 查询所有用户 /user     get
 * 根据查询用户 /user/1     get
 * 添加用户 /user     post
 * 修改用户 /user     put
 * 删除用户 /user/1     delete
 */
@Controller
public class TestRestController {

    //@RequestMapping(value = "/user",method = RequestMethod.GET)
    @GetMapping("/user")
    public String getAllUser(){
        System.out.println("查询所有用户信息 /get");
        return "success";
    }

    @RequestMapping(value = "/user/{id}",method = RequestMethod.GET)
    public String getUserById(@PathVariable("id") Integer id){
        System.out.println("get user by id /get" + id);
        return "success";
    }

    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public String insert(){
        System.out.println("insert user/post");
        return "success";
    }

    @RequestMapping(value = "/user",method = RequestMethod.PUT)
    public String update(){
        System.out.println("update/put");
        return "success";
    }

    @RequestMapping(value = "/user/{id}",method = RequestMethod.DELETE)
    public String delete(@PathVariable("id") Integer id){
        System.out.println("delete/delete");
        return "success";
    }


}
