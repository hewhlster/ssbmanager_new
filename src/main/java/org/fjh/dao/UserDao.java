package org.fjh.dao;

import org.fjh.entity.User;

 
public interface UserDao {
	public int getUserByUnameAndUpass(User user);
	public User getByUname(String uname);
}
