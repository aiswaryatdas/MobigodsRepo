package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.bean.LoginBean;
import com.example.demo.bean.UserRegisterBean;

@Repository
public interface UserRegisterRepo extends JpaRepository<UserRegisterBean,Integer>{

	
	

}
