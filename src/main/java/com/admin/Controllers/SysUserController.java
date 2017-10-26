package com.admin.Controllers;

import com.admin.model.SysUser;
import com.admin.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.logging.Logger;

/**
 * Created by zhenyang.he on 2017/10/25.
 */
@Controller
@RequestMapping("/hzy")
public class SysUserController {

    @Autowired
    private ISysUserService sysUserService;

    @RequestMapping("/select")
    public String getselectUser(){
         SysUser sysUser = sysUserService.selectId(1);
         return sysUser.getUserName().concat("  -  ").concat(sysUser.getStatus());
    }


}
