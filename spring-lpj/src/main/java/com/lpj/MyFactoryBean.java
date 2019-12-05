package com.lpj;

import com.lpj.dao.UserDao;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @classname: MyFactoryBean
 * @description:
 * @author: Desire
 * @date: 2019-09-18 11:23
 */
//@Component
public class MyFactoryBean implements FactoryBean, InvocationHandler {

	Class clazz;

	public MyFactoryBean(Class clazz) {
		this.clazz = clazz;
	}

	@Override
	public Object getObject() throws Exception {
		Object o = Proxy.newProxyInstance(this.getClass().getClassLoader(), new Class[]{clazz}, this);
		return o;
	}

	@Override
	public Class<?> getObjectType() {
		return UserDao.class;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Annotation[] declaredAnnotations = clazz.getDeclaredAnnotations();
		System.out.println("---- 执行代理MyInvocationHandler干预 ----");
		return null;

	}
}
