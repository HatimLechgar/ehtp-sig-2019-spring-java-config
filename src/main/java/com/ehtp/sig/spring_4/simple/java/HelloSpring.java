package com.ehtp.sig.spring_4.simple.java;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("scanedHello")
public class HelloSpring {

	private static final String SPRING_4_HELLO = "Spring : Hello ! ";
	private List creditCards;
	
	@Autowired(required=false)
	private Person person;

	public HelloSpring() {
		
	}
	
	public String printHello() {
		return SPRING_4_HELLO;
	}

	

	public List getCreditCards() {
		return creditCards;
	}

	public void setCreditCards(List creditCards) {
		this.creditCards = creditCards;
	}

	public String yourCreditCards() {
		return "Hello "+this.person.getName() +" your credits cards are : "+ this.creditCards.toString();
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
	
	
	
	

}
