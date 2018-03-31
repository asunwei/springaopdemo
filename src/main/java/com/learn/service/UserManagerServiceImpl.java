package com.learn.service;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;
import com.learn.entity.UserManager;

/**
 * 目标类
 * 
 * @author wei.sun02
 *
 */


@Service
public class UserManagerServiceImpl implements UserManagerService {
	public void addUser(String userName, String password) {
		System.out.println("--------------UserManager addUser-------------");
	}

	public void updateUser(int userId, String userName, String password) {
		System.out.println("--------------UserManager updateUser-------------");
	}

	public void deleteUser(int userId) {
		System.out.println("--------------UserManger deleteUser-------------");
	}

	public UserManager findUser(int userId) {
		UserManager userManager = new UserManager();
		System.out.println("--------------UserManager findUser-------------");
		return userManager;
	}
}
