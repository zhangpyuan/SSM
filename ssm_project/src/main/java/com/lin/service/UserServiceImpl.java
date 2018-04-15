package com.lin.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lin.dao.UserDao;
import com.lin.domain.User;

/**
 * 鍔熻兘姒傝锛歎serService瀹炵幇绫�
 * 
 * @author linbingwen
 * @since  2015骞�9鏈�28鏃� 
 */
@Service
public class UserServiceImpl implements UserService{
	@Resource
	private UserDao userDao;

	public User selectUserById(Integer userId) {
		return userDao.selectUserById(userId);
		
	}

	public User selectUserByUsername(String username) {
		// TODO Auto-generated method stub
		
		return userDao.selectUserByUsername(username);
	}

}
