package com.admin.Controllers;

import com.admin.Constant.UserConstants;
import com.admin.model.SysUser;
import com.admin.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


/**
 * Created by zhenyang.he on 2017/10/25.
 */
//@RestController 用于输出字符串
@Controller
@RequestMapping(value = "/hzy")
public class SysUserController {

    @Autowired
    private ISysUserService sysUserService;

    @RequestMapping(value = "/select",method = RequestMethod.POST)
    public String getselectUser(Model model,String userName,String password){
            if(UserConstants.ADMIN.equals(userName)){
                SysUser sysUser = sysUserService.selectId(1);
                model.addAttribute("user",sysUser);
            }
         return "User";
    }


}
