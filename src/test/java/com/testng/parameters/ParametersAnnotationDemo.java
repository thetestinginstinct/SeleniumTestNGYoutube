package com.testng.parameters;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersAnnotationDemo {

	@Parameters({"browser","url"})
	@Test
	public void parametersAnnotationTest(@Optional("chrome") String browserName,String testUrl) {
		System.out.println("Browser name is:"+browserName);
		System.out.println("Test url is:"+testUrl);
		
	}

}
