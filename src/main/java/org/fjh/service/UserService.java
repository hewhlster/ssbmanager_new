package org.fjh.service;

import java.util.List;

import org.fjh.entity.User;

public interface UserService {
	User adminLogin(User user);
	List<User> Pager();	
}