package com.testng.dataproviders;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SingleDataProviderTestNGTest {

	@Test(dataProvider = "userData",dataProviderClass = DataProviderDemo.class)
	public void createUser(String firstname, String lastname, String username, int mobile) {
		System.out.println("Firstname is:" + firstname);
		System.out.println("Lastname is:" + lastname);
		System.out.println("Username is:" + username);
		System.out.println("Mobile is:" + mobile);
	}

	@Test(dataProvider = "userData",dataProviderClass = DataProviderDemo.class)
	public void updateUser(String email, String address) {
		System.out.println("Email is:" + email);
		System.out.println("Address is:" + address);
	}

//	@DataProvider(name = "userData")
//	public Object[][] provideUserData(Method method) {
//		Object[][] data1 = { { "Tom", "Bob", "Tomy", 1234567890 } };
//
//		Object[][] data2 = { { "test123@gmail.com", "New Jersey" } };
//		String methodName=method.getName();
//		if(methodName.equals("createUser"))
//		{
//			return data1;
//			
//		}
//		else if(methodName.equals("updateUser"))
//		{
//			return data2;
//		}
//		else {
//			return new Object[][] {{"Please provide test data"},{"Please provide test data"}};
//		}
//	}

	
	

}
