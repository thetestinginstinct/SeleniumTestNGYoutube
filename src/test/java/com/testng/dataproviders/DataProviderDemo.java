package com.testng.dataproviders;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DataProviderDemo {


	@DataProvider(name = "userData")
	public Object[][] provideUserData(Method method) {
		Object[][] data1 = { { "Tom", "Bob", "Tomy", 1234567890 } };

		Object[][] data2 = { { "test123@gmail.com", "New Jersey" } };
		String methodName=method.getName();
		if(methodName.equals("createUser"))
		{
			return data1;
			
		}
		else if(methodName.equals("updateUser"))
		{
			return data2;
		}
		else {
			return new Object[][] {{"Please provide test data"},{"Please provide test data"}};
		}
	}

}
