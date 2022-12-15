package com.example.spring_boot_jpa;

import com.example.pojo.Admin;
import com.example.service.AdminService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class SpringBootJpaApplicationTests {

    @Resource
    private AdminService adminService;

    @Test
    void contextLoads() {
    }

    @Test
    public void test01(){
        List<Admin> adminList= adminService.findAll();
        adminList.forEach(admin -> System.out.println(admin));
    }
}
