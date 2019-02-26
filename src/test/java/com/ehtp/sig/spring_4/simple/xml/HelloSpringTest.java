package com.ehtp.sig.spring_4.simple.xml;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ehtp.sig.spring_4.simple.java.HelloSpring;
import com.ehtp.sig.spring_4.simple.java.config.HelloConfig;
import com.ehtp.sig.spring_4.simple.java.config.HelloConfigScan;

public class HelloSpringTest {

	@Test
	public void testPrintHello() {
		 ApplicationContext ctx = 
		         new AnnotationConfigApplicationContext(HelloConfig.class);

		HelloSpring helloSpringBean = (HelloSpring) ctx.getBean("helloBean");
		assertEquals("Spring : Hello ! ", helloSpringBean.printHello());
	}
	
	
	@Test
	public void testAutoWiring() {
		 ApplicationContext ctx = 
		         new AnnotationConfigApplicationContext(HelloConfigScan.class);

		HelloSpring helloSpringBean = (HelloSpring) ctx.getBean("scanedHello");
		assertEquals("Spring : Hello ! ", helloSpringBean.printHello());
	}
	
}
