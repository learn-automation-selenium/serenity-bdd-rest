package com.studentapp.junit;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.rest.SerenityRest;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import io.restassured.RestAssured;

@RunWith(SerenityRunner.class)
public class FirstSerenity {

	@BeforeClass
	public static void init() {
		RestAssured.baseURI = "http://localhost:9090";
	}
	
	@Test
	public void test001() {
		SerenityRest
		.given()
		.when()
		.get("/student/list")
		.then()
			.log().body(true)
			.assertThat().statusCode(200);
			//.body("[0].firstName", equalTo("Vernon"))
	}
}
