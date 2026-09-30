package com.api.BaseService;

import com.api.models.requests.EventRequest;

import io.restassured.response.Response;

public class EventService extends BaseService {
	
	public Response CreateEvent(EventRequest payload,String token) {
		setAuthToken(token);
		return postRequest(payload,"/events");
		
	}
	

}
