package com.learn.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
/**
 * 测试AOP类以XML配置形式
 * @author sunwei
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestUserManager {
//常用的读取XML的方式
//	@Test
//	@SuppressWarnings("resource")	
//	public void testUserManager() {
//
//		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
//		UserManagerService userBean = (UserManagerService) ctx.getBean("userManager");
//		userBean.addUser("zhaolibin", "buzhidao");
//	}
	
	@Autowired
	//@Qualifier("userManager")
	private UserManagerService userManager;
	
	@Test
	public void test() {
		userManager.addUser("5456454", "574654");
	}

}
