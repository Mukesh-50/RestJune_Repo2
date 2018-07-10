package testcases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class SmokeTesting 
{
	
	@Parameters({"TestURL","StatusCode"})
	@Test
	public void smokeTest(String url,String statusCode)
	{
		RestAssured.given().get(url).then().assertThat().statusCode(Integer.parseInt(statusCode));
	}

}
