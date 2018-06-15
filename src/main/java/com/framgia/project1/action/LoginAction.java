package com.framgia.project1.action;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{
	private String name;
	private String password;
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String execute() throws Exception{
//		if(getName().equals("admin")&&getPassword().equals("123456")){
//			
//			return SUCCESS;
//		}
//		else{
//			
//			addActionError("Tai khoan hoac mat khau khong dung");
//			return ERROR;
//		}
		return SUCCESS;
		
	}
	
	public void validate(){
		if(!getName().equals("admin")||!getPassword().equals("123456")){
			
			addActionError("Tai khoan hoac mat khau khong dung");
		}
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
