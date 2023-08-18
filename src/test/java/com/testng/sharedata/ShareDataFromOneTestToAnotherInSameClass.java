package com.testng.sharedata;

import org.testng.ITestContext;
import org.testng.annotations.Test;

public class ShareDataFromOneTestToAnotherInSameClass {
	
	@Test
	public void createUser(ITestContext context) {

	String userID="Steve333";
	context.setAttribute("updatedUserID", userID);
	}

	@Test
	public void updateUser(ITestContext context) {

	String userIDToBeUpdated=(String) context.getAttribute("updatedUserID");
	System.out.println("userIDToBeUpdated is:"+userIDToBeUpdated);

	}
}
