package com.testng.dataproviders;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderParallelRunTest {

	@Test(dataProvider = "userData1")
	public void createUser(String firstname, String lastname, String username, int mobile) {
		System.out.println("Firstname is:" + firstname);
		System.out.println("Lastname is:" + lastname);
		System.out.println("Username is:" + username);
		System.out.println("Mobile is:" + mobile);
		System.out.println("\n");
	}

	@DataProvider(name = "userData1",parallel = true)
	public Object[][] provideUserData() {
		Object[][] data1 = { 
				{ "Tom", "Bob", "Tomy", 1234567890 }, 
				{ "Tom1", "Bob1", "Tomy1", 1234567890 },
				{ "Tom2", "Bob2", "Tomy2", 1234567890 },
				{ "Tom3", "Bob3", "Tomy3", 1234567890 }
				};
		return data1;
	}

}
