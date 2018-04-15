package com.lin.service;

import org.springframework.stereotype.Service;

import com.lin.domain.User;

/**
 * 鍔熻兘姒傝锛歎serService鎺ュ彛绫�
 * 
 * @author linbingwen
 * @since  2015骞�9鏈�28鏃� 
 */
public interface UserService {
	User selectUserById(Integer userId);
	User selectUserByUsername(String username);

}
