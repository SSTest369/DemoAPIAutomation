package com.api.models.response;

public class LoginResponse {
	
		  private boolean success;
		  private String token; 
		  private User user;
		  
		  public LoginResponse() {};
		  public LoginResponse(boolean success, String token, User user) {
			super();
			this.success = success;
			this.token = token;
			this.user = user;
		  }
		  public boolean isSuccess() {
			  return success;
		  }
		  public void setSuccess(boolean success) {
			  this.success = success;
		  }
		  public String getToken() {
			  return token;
		  }
		  public void setToken(String token) {
			  this.token = token;
		  }
		  public User getUser() {
			  return user;
		  }
		  public void setUser(User user) {
			  this.user = user;
		  }
		  @Override
		  public String toString() {
			return "LoginResponse [success=" + success + ", token=" + token + "]";
		  }

public static class User{
		    private String id; 
		    private String email;
		    
		    public User() {};
			public User(String id, String email) {
				super();
				this.id = id;
				this.email = email;
			}
			public String getId() {
				return id;
			}
			public void setId(String id) {
				this.id = id;
			}
			public String getEmail() {
				return email;
			}
			public void setEmail(String email) {
				this.email = email;
			}
			@Override
			public String toString() {
				return "User [id=" + id + ", email=" + email + "]";
			}
		 
	
	
	
}
}
