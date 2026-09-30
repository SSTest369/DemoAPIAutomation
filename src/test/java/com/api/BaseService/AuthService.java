package com.api.BaseService;

import com.api.models.requests.LoginRequest;
import com.api.models.requests.RegisterRequest;

import io.restassured.response.Response;

public class AuthService extends BaseService {

	private static final String BASE_PATH = "/auth/";
	
	
	public Response register(RegisterRequest payload) {
		return postRequest(payload, BASE_PATH + "register");
	}
	
	public Response login(LoginRequest payload) {
		return postRequest(payload, BASE_PATH + "login");
		
	}
}
