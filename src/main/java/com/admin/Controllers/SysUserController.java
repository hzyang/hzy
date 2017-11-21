package com.admin.Controllers;

import com.admin.model.SysUser;
import com.admin.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Created by zhenyang.he on 2017/10/25.
 */
//@RestController 用于输出字符串
@Controller
@RequestMapping("/hzy")
public class SysUserController {

    @Autowired
    private ISysUserService sysUserService;

    @RequestMapping("/select")
    public String getselectUser(Model model){
         SysUser sysUser = sysUserService.selectId(1);
         model.addAttribute("user",sysUser);
         return "User";
    }


}
