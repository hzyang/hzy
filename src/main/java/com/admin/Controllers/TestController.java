package com.admin.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhenyang.he on 2017/9/21.
 */
@RestController
public class TestController {

    @RequestMapping("/test")
    String test(){
        return "Test is Succrss?";
    }
}
