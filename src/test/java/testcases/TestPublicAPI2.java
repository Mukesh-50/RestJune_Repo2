package testcases;

import org.testng.annotations.Test;


import helper.BaseClass;
import helper.Utility;

import static io.restassured.RestAssured.*;

public class TestPublicAPI2 extends BaseClass{

	@Test
	public void verifyContent()
	{
		Utility.verifyJsonDataContains(given().get().body().asString(),"title", "provident");
	}
	
	
	
	
}
