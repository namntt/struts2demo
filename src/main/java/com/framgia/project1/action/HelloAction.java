package com.framgia.project1.action;

public class HelloAction {
	private String name;
	
	public String execute() throws Exception{
		return "success";
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}