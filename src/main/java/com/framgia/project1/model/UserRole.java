package com.framgia.project1.model;

import java.io.Serializable;

public class UserRole implements Serializable{
	private int id;
	private Role role;
	private User user;

	public UserRole() {
	}

	public UserRole(int id) {
		this.id = id;
	}

	public UserRole(int id, Role role, User user) {
		this.id = id;
		this.role = role;
		this.user = user;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Role getRole() {
		return this.role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
