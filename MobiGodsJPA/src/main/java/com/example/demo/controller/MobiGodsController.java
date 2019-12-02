package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.example.demo.bean.LoginBean;
import com.example.demo.bean.UserRegisterBean;
import com.example.demo.repository.LoginRepo;
import com.example.demo.repository.UserRegisterRepo;

@Controller
public class MobiGodsController {

	@Autowired
	private UserRegisterRepo userRepo;
	@Autowired
	private LoginRepo loginRepo;

	@GetMapping("/mobigods")
	public String showHomePage() {
		return "index";
	}

	@GetMapping("/mobigods/signup")
	public String signUp() {
		return "signUp";
	}

	@GetMapping("/mobigods/signin")
	public String signIn() {
		return "signIn";
	}

	@PostMapping("/mobigods/signupaction")
	public String signupAction(UserRegisterBean userReg, LoginBean login) {
		userRepo.save(userReg);
		System.out.println(userReg.getName());
		login.setU_id(userReg.getId());
		login.setLname(userReg.getName());
		login.setLpassword(userReg.getPassword());
		login.setLrole("user");
		loginRepo.save(login);

		return "success";

	}

	@PostMapping("/mobigods/signinaction")
	public String signinAction(HttpServletRequest req, HttpServletResponse res, Model model, LoginBean login) {
		try {
			login = loginRepo.FindByLnameAndLpassword(login.getLname(), login.getLpassword());

			if (login.getLrole().equals("user")) {
				model.addAttribute("name", login.getLname());
				return "userHome";
			} else {
				return "index";
			}
		} catch (Exception e) {

			e.printStackTrace();
		}
		return "index";
	}

	@GetMapping("/mobigods/home")
	public String backToHome() {
		return "index";
	}
	@GetMapping("/mobigods/view")
	public String viewUser(Model model,UserRegisterBean userReg ) {
		List<UserRegisterBean> userList=new ArrayList<UserRegisterBean>(); 
		 userList=userRepo.findAll();
		model.addAttribute("userList",userList);
		return "view";
		
	}
	@GetMapping("/mobigods/update")
	public String update(HttpServletRequest req,HttpServletResponse res,UserRegisterBean userReg) {
		HttpSession session=req.getSession();
		session.setAttribute("id",userReg.getId());
		return "updateAction";
	}
	/*@PutMapping("/mobigods/updateAction")
	public String updateAction(HttpServletRequest req,HttpServletResponse res,UserRegisterBean userReg) {
		HttpSession session=req.getSession(false);
		session.getAttribute("id");
		boolean exists=user
		return "success";
	}*/

}
