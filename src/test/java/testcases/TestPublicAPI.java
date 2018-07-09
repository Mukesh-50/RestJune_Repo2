package testcases;

import org.testng.annotations.Test;


import helper.BaseClass;
import helper.Utility;

import static io.restassured.RestAssured.*;

public class TestPublicAPI extends BaseClass{

	@Test
	public void verifyStatus()
	{
		Utility.verifyResponseCode200(given().get().getStatusCode());
		
	/*	int response=given().get().getStatusCode();
		Utility.verifyResponseCode200(response);*/
		
	}
	
	@Test
	public void verifyContent()
	{
		Utility.verifyJsonData(given().get().body().asString(),"userId","1");
	}
	
	
	
	
}
