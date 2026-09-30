package com.api.tests;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.BaseService.AuthService;
import com.api.BaseService.EventService;
import com.api.models.requests.EventRequest;
import com.api.models.requests.LoginRequest;
import com.api.models.response.EventResponse;
import com.api.models.response.LoginResponse;

import io.restassured.response.Response;


public class CreateEventTest {
	
	@Test
	public void createNewEvent() {
		EventRequest eventRequest = new EventRequest.Builder()
				.title("RJB")
				.description("API Automation Tester")
				.category("Automation")
				.venue("NaviMumbai")
				.city("Mumbai")
				.eventDate("2026-10-15T09:00:00.000Z")
				.price(8888)
				.totalSeats(369)
				.imageUrl("https://example.com/banner.jpg")
				.build();
		
		AuthService authService = new AuthService();
		Response response = authService.login(new LoginRequest("rjb123@gmail.com","rjb1234"));
		LoginResponse loginResponse = response.as(LoginResponse.class);
		String token = loginResponse.getToken();
		
		EventService eventService = new EventService();
		response = eventService.CreateEvent(eventRequest, token);
		//EventResponse eventResponse = response.as(EventResponse.class);
		//Assert.assertEquals(eventResponse.getMessage(), "Event created successfully");
		System.out.println(response.asPrettyString());
		
		
	}
	
}
