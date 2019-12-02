package com.example.demo.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table (name="SPRING_LOGINN_TBL")
public class LoginBean {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="LOGIN_SEQQ")
	@SequenceGenerator(sequenceName="SPRINGSEQ_NEW",allocationSize=1,name="LOGIN_SEQQ")
	
	private int id;
	private int u_id;
	private String lname;
	private String lpassword;
	private String lrole;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getU_id() {
		return u_id;
	}
	public void setU_id(int u_id) {
		this.u_id = u_id;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getLpassword() {
		return lpassword;
	}
	public void setLpassword(String lpassword) {
		this.lpassword = lpassword;
	}
	public String getLrole() {
		return lrole;
	}
	public void setLrole(String lrole) {
		this.lrole = lrole;
	}
	

}
