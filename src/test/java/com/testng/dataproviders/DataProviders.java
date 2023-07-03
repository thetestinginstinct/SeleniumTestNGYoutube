package com.testng.dataproviders;

import org.testng.annotations.DataProvider;

public class DataProviders {
	
	@DataProvider(name = "loginData")
	public Object[][] testdata() {
		Object[][] data = new String[3][2];
		
		data[0][0] = "standard_user";
		data[0][1] = "secret_sauce";

		data[1][0] = "wrong username";
		data[1][1] = "wrong password";
		
		data[2][0] = "wrong username1";
		data[2][1] = "wrong password1";
		
		return data;
	}
	@DataProvider(name = "loginData1")
	public Object[][] valuestoTest() {
		Object[][] values = new Object[][] 
		{ 
		{ "standard_user", "secret_sauce" }, 
		{ "wrong username4", "wrong password4" },
		{ "wrong username5", "wrong password5" } 
		};
		return values;

	}

}
