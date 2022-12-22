package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class TestAjaxController {

    @RequestMapping("/test/ajax")
    public void testAjax(Integer id, @RequestBody String requestBody, HttpServletResponse httpServletResponse) throws IOException {
        System.out.println("id=" + id);
        System.out.println("request body" + requestBody);
        httpServletResponse.getWriter().write("hello axios");
    }

    /**
     * s使用 @requestBody 把 json 转化为java 对象
     * @param httpServletResponse
     * @throws IOException
     */
    @RequestMapping("/test/requestBody/json")
    public void testRequestBody(@RequestBody User user,HttpServletResponse httpServletResponse) throws IOException {//因为这里是 ajax，是局部刷新，不用重新访问页面，所以不用返回 String
        System.out.println(user);
        httpServletResponse.getWriter().write("hello requestbody");
    }
}
