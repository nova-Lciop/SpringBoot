package com.example.repository;

import com.example.pojo.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AdminRepository extends JpaRepository<Admin,String> {

    List<Admin> findByName(String a_name);
}
