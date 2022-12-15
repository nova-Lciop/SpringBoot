package com.example.service;

import com.example.pojo.Admin;

import java.util.List;

public interface AdminService {

    List<Admin> findAll();
    Admin save(Admin admin);
    void delete(Integer id);
    Admin findById(String id);
    List<Admin> findByName(String name);
}
