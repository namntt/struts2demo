//package com.framgia.project1.action;
//
//import com.framgia.project1.dao.UserDAO;
//import com.framgia.project1.dao.impl.UserDAOImpl;
//import com.framgia.project1.model.User;
//import com.opensymphony.xwork2.ActionSupport;
//import com.opensymphony.xwork2.ModelDriven;
//
//public class LoginAction extends ActionSupport implements ModelDriven<User> {
//	private User user = new User();
//	
//	public String execute() throws Exception{
//		
//		UserDAO userDAO = new UserDAOImpl();
//		User userDB = userDAO.checkLogin(user.getUsername(), user.getPassword());
//		
//		if(userDB != null){
//			System.out.println("User Retrieved from DB::"+userDB);
//			user.setUsername(userDB.getUsername());
//			user.setPassword(userDB.getPassword());
//			return SUCCESS;
//		}
//		
//		return ERROR;
//		
//	}
//
//	public User getModel() {
//		// TODO Auto-generated method stub
//		return user;
//	}
//	
//	
//	
//
//	
//}
