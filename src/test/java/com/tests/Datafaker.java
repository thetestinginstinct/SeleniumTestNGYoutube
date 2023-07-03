package com.tests;

import net.datafaker.Faker;

public class Datafaker {

	public static void main(String[] args) {
		
		Faker faker = new Faker();

		String name = faker.name().fullName(); 
		String firstName = faker.name().firstName();
		String emailAddress=faker.internet().emailAddress();
		String password=faker.internet().password(7, 9, true, true, true);
		System.out.println("name is:"+name);
		System.out.println("firstName is:"+firstName);
		System.out.println("emailAddress is:"+emailAddress);
		System.out.println("password is:"+password);
		

		
	}

}
