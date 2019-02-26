package com.ehtp.sig.spring_4.simple.java.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ehtp.sig.spring_4.simple.java.HelloSpring;
import com.ehtp.sig.spring_4.simple.java.Person;

@Configuration
public class HelloConfig {

	@Bean(name="helloBean")
	public HelloSpring createWithName() {
		HelloSpring helloSpringBean = new HelloSpring();
		helloSpringBean.setPerson(new Person());
		return helloSpringBean;

	}
	

}
