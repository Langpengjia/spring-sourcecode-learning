package com.lpj;

import com.lpj.dao.UserDao;
import com.lpj.dao.UserDaoImpl;
import sun.misc.ProxyGenerator;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @classname: MainTest
 * @description:
 * @author: Desire
 * @date: 2019-08-27 13:55
 */
public class MainTest {


	public static void main(String[] args) {

	//--------------------------------------------------
//		/**
//		 * 神级构造方法
//		 * Spring 初始化过程（spring 所有前提环境） ------
//		 * 完成bean工厂初始化
//		 * 完成bean容器
//		 * 完成bean实例化
//		 * 完成spring所有功能
//		 */
//		AnnotationConfigApplicationContext context =
//				new AnnotationConfigApplicationContext(AppConfig.class);
//		context.refresh();
//		UserDao userDao = (UserDao)context.getBean("userDaoImpl");
//		userDao.query();
	//--------------------------------------------------



//		AnnotationConfigApplicationContext context =
//				new AnnotationConfigApplicationContext(AppConfig.class);
//
//		UserService userService = (UserService)context.getBean("userService");
//
//		userService.test();
		MainTest mainTest = new MainTest();
		mainTest.test2();

	}


	public void test(){
		UserDaoImpl dao = new UserDaoImpl();
		UserDao userDao = (UserDao) Proxy.newProxyInstance(MainTest.this.getClass().getClassLoader(), new Class[]{UserDao.class}, (Object proxy, Method method, Object[] a) -> {
			method.invoke(dao);
			System.out.println("------------- invoke a proxy method --------------");
			return null;
		});
		System.out.println(userDao instanceof UserDaoImpl);
		System.out.println(userDao instanceof UserDao);
		userDao.query();
	}

	public void test2() {

		byte[] aaas = ProxyGenerator.generateProxyClass("DemoClass", new Class[]{UserDao.class});

		FileOutputStream outputStream = null;
		try {
			outputStream = new FileOutputStream("D://DemoClass.class");
			outputStream.write(aaas);
		} catch (Exception e) {
			e.printStackTrace();
		}


	}






}
