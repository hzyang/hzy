package com.admin.service.Impl;

import com.admin.mapper.SysUserMapper;
import com.admin.model.SysUser;
import com.admin.service.ISysUserService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zhenyang.he on 2017/10/25.
 */
@Service
public class SysUserServiceImpl implements ISysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public SysUser selectId(Integer id) {

        SysUser sysUser = sysUserMapper.selectByPrimaryKey(id);

        return sysUser;
    }
}
