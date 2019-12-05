package com.lpj;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

/**
 * @classname: AppConfig
 * @description:
 * @author: Desire
 * @date: 2019-08-27 14:24
 */
@Configuration
//@Import(MyImportBeanDefinitionRegisterar.class)
@ComponentScan("com.lpj.*")
public class AppConfig {


}
