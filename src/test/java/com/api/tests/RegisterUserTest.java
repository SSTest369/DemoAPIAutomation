package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.BaseService.AuthService;
import com.api.models.requests.RegisterRequest;
import com.api.models.response.RegisterResponse;

import io.restassured.response.Response;

public class RegisterUserTest {
	
	@Test(description="Validate User registration")
	public void RegisterUser() {
		RegisterRequest registerRequest = new RegisterRequest("rjb123@gmail.com","rjb1234");
		
		AuthService authService = new AuthService();
		Response response = authService.register(registerRequest);
		RegisterResponse registerResponse = response.as(RegisterResponse.class);
		
		String token = registerResponse.getToken();
		System.out.println(registerResponse.getUser().getId());
		System.out.println(token);
		Assert.assertTrue(registerResponse.isSuccess());
	}

}
