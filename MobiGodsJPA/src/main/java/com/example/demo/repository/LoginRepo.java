package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.bean.LoginBean;

@Repository
public interface LoginRepo extends JpaRepository<LoginBean,Integer> {
	
	@Query("SELECT u FROM LoginBean u WHERE u.lname = ?1 and u.lpassword=?2")
	LoginBean FindByLnameAndLpassword(String lname,String lpassword);
}
