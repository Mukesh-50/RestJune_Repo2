package helper;

import org.testng.annotations.BeforeSuite;

import dataProvider.DataProvider;
import io.restassured.RestAssured;

public class BaseClass {

	@BeforeSuite
	public void setUp() {
		/*
		 * DataProvider data=new DataProvider(); String url=data.getStagingURL();
		 */
		RestAssured.baseURI = new DataProvider().getStagingURL();
		//RestAssured.authentication = RestAssured.basic(new DataProvider().getUserName(),
		//		new DataProvider().getPassWord());
	}

}
