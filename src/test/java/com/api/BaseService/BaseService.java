package com.api.BaseService;
import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseService {
	private static final String BASE_URL = "https://api.eventhub.rahulshettyacademy.com/api";
	private RequestSpecification requestSpecification;
	
	public BaseService() {
		requestSpecification = given().baseUri(BASE_URL);		
	}
	
	public void setAuthToken(String token) {
		requestSpecification.header("Authorization","Bearer "+token);
	}
	
	public Response postRequest(Object payload,String endpoint) {
		return requestSpecification.contentType(ContentType.JSON).body(payload).post(endpoint);
	}
	
	
	
	
	

}
