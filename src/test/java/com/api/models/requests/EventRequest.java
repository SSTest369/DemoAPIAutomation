package com.api.models.requests;

public class EventRequest {
	
		  private String title;
		  private String description;
		  private String category;
		  private String venue;
		  private String city;
		  private String eventDate; 
		  private int price;
		  private int totalSeats;
		  private String imageUrl;
		  
		  public EventRequest() {};
		  
		  
		  private EventRequest(String title, String description, String category, String venue, String city,
				String eventDate, int price, int totalSeats, String imageUrl) {
			super();
			this.title = title;
			this.description = description;
			this.category = category;
			this.venue = venue;
			this.city = city;
			this.eventDate = eventDate;
			this.price = price;
			this.totalSeats = totalSeats;
			this.imageUrl = imageUrl;
		  }


		  public String getTitle() {
			  return title;
		  }


		  public void setTitle(String title) {
			  this.title = title;
		  }


		  public String getDescription() {
			  return description;
		  }


		  public void setDescription(String description) {
			  this.description = description;
		  }


		  public String getCategory() {
			  return category;
		  }


		  public void setCategory(String category) {
			  this.category = category;
		  }


		  public String getVenue() {
			  return venue;
		  }


		  public void setVenue(String venue) {
			  this.venue = venue;
		  }


		  public String getCity() {
			  return city;
		  }


		  public void setCity(String city) {
			  this.city = city;
		  }


		  public String getEventDate() {
			  return eventDate;
		  }


		  public void setEventDate(String eventDate) {
			  this.eventDate = eventDate;
		  }


		  public int getPrice() {
			  return price;
		  }


		  public void setPrice(int price) {
			  this.price = price;
		  }


		  public int getTotalSeats() {
			  return totalSeats;
		  }


		  public void setTotalSeats(int totalSeats) {
			  this.totalSeats = totalSeats;
		  }


		  public String getImageUrl() {
			  return imageUrl;
		  }


		  public void setImageUrl(String imageUrl) {
			  this.imageUrl = imageUrl;
		  }


		  @Override
		  public String toString() {
			return "EventService [title=" + title + ", description=" + description + ", category=" + category
					+ ", venue=" + venue + ", city=" + city + ", eventDate=" + eventDate + ", price=" + price
					+ ", totalSeats=" + totalSeats + ", imageUrl=" + imageUrl + "]";
		  } 
		  
		  
		  

		  
public static class Builder {
	  private String title;
	  private String description;
	  private String category;
	  private String venue;
	  private String city;
	  private String eventDate; 
	  private int price;
	  private int totalSeats;
	  private String imageUrl;
	  
	  public Builder title(String title) {
		  this.title = title;
		  return this;
	  }
	
	  public Builder description(String description) {
		  this.description = description;
		  return this;
	  }
	  
	  public Builder category(String category) {
		  this.category = category;
		  return this;
	  }
	  
	  public Builder venue(String venue) {
		  this.venue = venue;
		  return this;
	  }
	  
	  public Builder city(String city) {
		  this.city = city;
		  return this;
	  }
	  
	  public Builder eventDate(String eventDate) {
		  this.eventDate = eventDate;
		  return this;
	  }
	  
	  public Builder price(int price) {
		  this.price = price;
		  return this;
	  }
	  
	  public Builder totalSeats(int totalSeats) {
		  this.totalSeats = totalSeats;
		  return this;
	  }
	  
	  public Builder imageUrl(String imageUrl) {
		  this.imageUrl = imageUrl;
		  return this;
	  }
	  
	  public EventRequest build() {
		  EventRequest eventRequest = new EventRequest(title, description, category, venue, city, eventDate, price, totalSeats, imageUrl);
		  return eventRequest;
	  }
	  
}		  
		  
}
