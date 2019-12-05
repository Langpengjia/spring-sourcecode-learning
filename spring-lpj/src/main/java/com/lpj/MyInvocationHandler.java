package com.lpj;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @classname: MyInvocationHandler
 * @description:
 * @author: Desire
 * @date: 2019-09-18 10:40
 */
public class MyInvocationHandler implements InvocationHandler {
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

		System.out.println("---- 执行代理MyInvocationHandler干预 ----");


		return null;
	}
}
