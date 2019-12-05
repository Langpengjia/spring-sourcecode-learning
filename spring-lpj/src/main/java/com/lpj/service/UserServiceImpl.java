package com.lpj.service;

import com.lpj.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @classname: UserServiceImpl
 * @description:
 * @author: Desire
 * @date: 2019-10-21 10:17
 */
@Component("userService")
public class UserServiceImpl implements UserService{


//	@Autowired
//	private UserDao userDao;

	public UserServiceImpl(UserDao userDao) {
		System.out.println(userDao);
		System.out.println("----------service constructor----------");
	}

	public void set(UserDao userDao){
		System.out.println("----------- servive set method -----------");

	}


	@Override
	public void test() {

//		System.out.println(userDao);
		System.out.println("-------执行userService方法-------");
	}
}
