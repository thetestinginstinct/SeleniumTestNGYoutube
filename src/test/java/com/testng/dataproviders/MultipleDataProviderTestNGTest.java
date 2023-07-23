package com.testng.dataproviders;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultipleDataProviderTestNGTest {

	@Test(dataProvider = "userData1")
	public void createUser(String firstname, String lastname, String username, int mobile) {
		System.out.println("Firstname is:" + firstname);
		System.out.println("Lastname is:" + lastname);
		System.out.println("Username is:" + username);
		System.out.println("Mobile is:" + mobile);
	}

	@Test(dataProvider = "userData2")
	public void updateUser(String email, String address) {
		System.out.println("Email is:" + email);
		System.out.println("Address is:" + address);
	}

	@DataProvider(name = "userData1")
	public Object[][] provideUserData() {
		Object[][] data1 = { { "Tom", "Bob", "Tomy", 1234567890 } };
		return data1;
	}

	@DataProvider(name = "userData2")
	public Object[][] provideUserData1() {
		Object[][] data2 = { { "test123@gmail.com", "New Jersey" } };
		return data2;
	}

}
