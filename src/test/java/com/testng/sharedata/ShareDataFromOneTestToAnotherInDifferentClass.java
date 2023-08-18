package com.testng.sharedata;

import org.testng.ITestContext;
import org.testng.annotations.Test;

public class ShareDataFromOneTestToAnotherInDifferentClass {
	
	@Test
	public void updateUser(ITestContext context) {

		String userIDToBeUpdated=(String) context.getAttribute("updatedUserID");
		System.out.println("userIDToBeUpdated is:"+userIDToBeUpdated);

	}
}
