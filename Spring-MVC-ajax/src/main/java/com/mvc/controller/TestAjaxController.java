package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class TestAjaxController {

    @RequestMapping("/test/ajax")
    public void testAjax(Integer id, @RequestBody String requestBody, HttpServletResponse httpServletResponse) throws IOException {
        System.out.println("id=" + id);
        System.out.println("request body" + requestBody);
        httpServletResponse.getWriter().write("hello axios");
    }

    /**
     * 使用 @requestBody 把 json 转化为java 对象
     * @param httpServletResponse
     * @throws IOException
     */
    @RequestMapping("/test/requestBody/json")
    public void testRequestBody(@RequestBody User user,HttpServletResponse httpServletResponse) throws IOException {//因为这里是 ajax，是局部刷新，不用重新访问页面，所以不用返回 String
        System.out.println(user);
        httpServletResponse.getWriter().write("hello requestbody");
    }


    /**
     * 返回 java 对象 -> json 对象
     * @return
     * @throws IOException
     */
//    @RequestMapping("/test/responseBody/json")
//    @ResponseBody
//    public User testResponseBody() throws IOException {//因为这里是 ajax，是局部刷新，不用重新访问页面，所以不用返回 String
//        return new User(12,"1234","ininin",12,"male");
//    }

    //响应浏览器list集合
    @RequestMapping("/test/responseBody/json")
    @ResponseBody
    public List<User> testResponseBodyList(){
        User user1 = new User(1001,"admin1","123456",23,"男");
        User user2 = new User(1002,"admin2","123456",23,"男");
        User user3 = new User(1003,"admin3","123456",23,"男");
        List<User> list = Arrays.asList(user1, user2, user3);
        return list;
    }

//    //响应浏览器map集合
//    @RequestMapping("/test/ResponseBody/json")
//    @ResponseBody
//    public Map<String, Object> testResponseBody(){
//        User user1 = new User(1001,"admin1","123456",23,"男");
//        User user2 = new User(1002,"admin2","123456",23,"男");
//        User user3 = new User(1003,"admin3","123456",23,"男");
//        Map<String, Object> map = new HashMap<>();
//        map.put("1001", user1);
//        map.put("1002", user2);
//        map.put("1003", user3);
//        return map;
//    }
}

