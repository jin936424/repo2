package com.jwh.service.impl;

import com.jwh.entity.Admin;
import com.jwh.mapper.AdminMapper;
import com.jwh.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: 渣渣灰
 * @Date: 2020/4/6 20:09
 * @Description:
 */
@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminMapper adminMapper ;


    @Override
    public Admin selectAdmin(Admin admin) {
        return this.adminMapper.selectAdmin(admin) ;
    }

    @Override
    public List<Admin> selectAllAdmin() {
        return this.adminMapper.selectByExample(null);
    }
}
