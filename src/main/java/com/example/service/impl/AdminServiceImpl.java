package com.example.service.impl;

import com.example.pojo.Admin;
import com.example.repository.AdminRepository;
import com.example.service.AdminService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {


    @Resource//指定名称装配
    private AdminRepository adminRepository;

    @Override
    public List<Admin> findAll() {
        return adminRepository.findAll();
    }

    @Transactional
    @Override
    public Admin save(Admin admin) {

        Admin saveAdmin = adminRepository.save(admin);

        String error = null;
        error.split("/");
        return adminRepository.save(admin);
    }

    @Override
    public void delete(Integer id) {
        adminRepository.deleteById(id.toString());
    }

    @Override
    public Admin findById(String id) {
        return adminRepository.findById(id).get();
    }

    @Override
    public List<Admin> findByName(String name) {
        return adminRepository.findByName(name);
    }
}
