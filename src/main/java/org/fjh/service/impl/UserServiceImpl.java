package org.fjh.service.impl;

import java.util.List;

import org.fjh.dao.UserDao;
import org.fjh.entity.User;
import org.fjh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	public User adminLogin(User user){
		int ret  = userDao.getUserByUnameAndUpass(user);
		if( ret == 0)
			return null;
		User loginedUser = userDao.getByUname(user.getUname());
		return loginedUser;
	}

	public List<User> Pager() {
		// TODO Auto-generated method stub
		return null;
	}
}