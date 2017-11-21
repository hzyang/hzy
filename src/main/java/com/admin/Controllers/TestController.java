package com.admin.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by zhenyang.he on 2017/9/21.
 */
@RestController
public class TestController {

    @RequestMapping("/test")
    public void index(HttpServletRequest request, HttpServletResponse response) throws IOException{
        String ua =request.getHeader("User-Agent");
        PrintWriter writer = response.getWriter();
        writer.write("this is something log ："+ua);
        writer.flush();
    }
}
