package com.admin.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhenyang.he on 2017/9/21.
 */
@Controller
@RequestMapping("/hzy")
public class TestController {

    @RequestMapping("/login")
    String test(){
        return "index";
    }
}
