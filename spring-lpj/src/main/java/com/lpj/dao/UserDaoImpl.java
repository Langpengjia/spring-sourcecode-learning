package com.lpj.dao;

import org.springframework.stereotype.Component;

/**
 * @classname: UserDaoImpl
 * @description:
 * @author: Desire
 * @date: 2019-10-21 10:18
 */
@Component
public class UserDaoImpl implements UserDao{


	@Override
	public void query() {
		System.out.println("---------- invoke query method----------");
	}
}
