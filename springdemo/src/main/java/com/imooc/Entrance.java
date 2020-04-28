package com.imooc;
import com.imooc.service.impl.WelcomeServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Entrance {
	public static void main(String[] args) {
		System.out.println("Hello World");
		String xmlPath = "//home/haomingc/IdeaProjects/spring-framework-5.2.0.RELEASE/springdemo/src/main/resources/spring-config.xml";
		ApplicationContext applicationContext = new FileSystemXmlApplicationContext(xmlPath);
		WelcomeServiceImpl welcomeService = (WelcomeServiceImpl) applicationContext.getBean("WelcomeService");
		welcomeService.sayHello("Hi");
	}
}
