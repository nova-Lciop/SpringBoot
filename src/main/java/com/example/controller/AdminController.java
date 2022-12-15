package com.example.controller;


import com.example.pojo.Admin;
import com.example.service.AdminService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController("/admin")
public class AdminController {

    @Resource
    private AdminService adminService;

    @RequestMapping("/test")
    public String test(Model model){
        List<Admin> adminList = adminService.findAll();
        model.addAttribute("users",adminList);
        return "adminList";
    }
}
