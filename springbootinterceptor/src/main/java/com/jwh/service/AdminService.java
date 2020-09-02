package com.jwh.service;

import com.jwh.entity.Admin;

import java.util.List;

public interface AdminService {

    Admin selectAdmin(Admin admin) ;
    List<Admin> selectAllAdmin() ;
}
