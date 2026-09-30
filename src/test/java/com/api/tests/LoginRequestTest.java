package com.api.tests;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.BaseService.AuthService;
import com.api.models.requests.LoginRequest;
import com.api.models.response.LoginResponse;

import io.restassured.response.Response;

public class LoginRequestTest {
	
	@Test(description="Validate login Request")
	public void LoginRequest() {
		
		LoginRequest loginRequest = new LoginRequest("rjb123@gmail.com","rjb1234");
		
		AuthService authService = new AuthService();
		Response response = authService.login(loginRequest);
		LoginResponse loginResponse = response.as(LoginResponse.class);
		
		Assert.assertTrue(loginResponse.isSuccess());
		Assert.assertEquals(loginResponse.getUser().getEmail(), "rjb123@gmail.com");
		
		System.out.println(response.asPrettyString());
		
		
		
	}

}
