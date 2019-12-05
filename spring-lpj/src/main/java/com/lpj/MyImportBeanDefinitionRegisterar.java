package com.lpj;

import com.lpj.dao.UserDao;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.lang.reflect.Proxy;

/**
 * @classname: MyImportSelect
 * @description:
 * @author: Desire
 * @date: 2019-09-18 10:47
 */
public class MyImportBeanDefinitionRegisterar implements ImportBeanDefinitionRegistrar {

	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {



		//@Import标签内可以传入三中类型的类
		//1-- ImportSelector
		//2--


		//得到BD
		BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder.genericBeanDefinition(UserDao.class);
		AbstractBeanDefinition beanDefinition = beanDefinitionBuilder.getBeanDefinition();

//		beanDefinition.getConstructorArgumentValues().addGenericArgumentValue("com.lpj.dao.UserDao");

		beanDefinition.getConstructorArgumentValues().addGenericArgumentValue(beanDefinition.getBeanClass());

		beanDefinition.setBeanClass(MyFactoryBean.class);
		registry.registerBeanDefinition("lpjDao",beanDefinition);





	}
}
