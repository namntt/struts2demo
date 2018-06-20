package com.framgia.project1.action;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletContext;

import org.apache.struts2.util.ServletContextAware;
import org.hibernate.SessionFactory;

import com.framgia.project1.dao.UserDAO;
import com.framgia.project1.dao.impl.UserDAOImpl;
import com.framgia.project1.model.User;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class LoginAction implements Action,ServletContextAware,ModelDriven<User> {
	private User user = new User();
	
	private ServletContext ctx;
	
	
	public String execute() throws Exception{
		SessionFactory sf = (SessionFactory) ctx.getAttribute("SessionFactory");
		UserDAO userDAO = new UserDAOImpl(sf);
		User userDB = userDAO.checkLogin(user.getUsername(), user.getPassword());
		if(userDB == null) return ERROR;
		else {
			user.setUsername(userDB.getUsername());
			user.setPassword(userDB.getPassword());
			return SUCCESS;
		}
		
	}
	
	/*public void validate(){
		if(!getName().equals("admin")||!getPassword().equals("123456")){
			
			addActionError("Tai khoan hoac mat khau khong dung");
		}
		
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}*/
	public void setServletContext(ServletContext sc) {
		// TODO Auto-generated method stub
		this.ctx=sc;
		
	}

	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}

	
}
