package com.nova.test;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloTest {
	@Test
	void Test() {
		
		//Initialize IOC container
		var context=new GenericXmlApplicationContext();	
		
		//load configuration
		context.load("classpath:/helloConfig.xml");
		//Refresh IOC Container
		context.refresh();
		//Close IOC container
		context.close();
	}
}
