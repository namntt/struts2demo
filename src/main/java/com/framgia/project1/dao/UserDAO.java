package com.framgia.project1.dao;

import com.framgia.project1.model.User;

public interface UserDAO {
	User checkLogin(String username, String password);
}
