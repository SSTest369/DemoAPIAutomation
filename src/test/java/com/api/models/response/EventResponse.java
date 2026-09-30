package com.api.models.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EventResponse {

	private boolean success;
	private Data data;
	private String message;
	private String error;   


	public EventResponse() {
	}

	public EventResponse(boolean success, Data data, String message) {
		super();
		this.success = success;
		this.data = data;
		this.message = message;
	}


	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}
	
	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "EventResponse [success=" + success + ", message=" + message + "]";
	};

	public static class Data {

		private String title;
		private int id;
		private String description;
		private String category;
		private String venue;
		private String city;
		private String eventDate;
		private int price;
		private int totalSeats;
		private int availableSeats;
		private String imageUrl;
		private String createdAt;
		private String updatedAt;
		
		public Data() {};
		
		public Data(String title, int id, String description, String category, String venue, String city,
				String eventDate, int price, int totalSeats, int availableSeats, String imageUrl, String createdAt,
				String updatedAt) {
			super();
			this.title = title;
			this.id = id;
			this.description = description;
			this.category = category;
			this.venue = venue;
			this.city = city;
			this.eventDate = eventDate;
			this.price = price;
			this.totalSeats = totalSeats;
			this.availableSeats = availableSeats;
			this.imageUrl = imageUrl;
			this.createdAt = createdAt;
			this.updatedAt = updatedAt;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
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
		public int getAvailableSeats() {
			return availableSeats;
		}
		public void setAvailableSeats(int availableSeats) {
			this.availableSeats = availableSeats;
		}
		public String getImageUrl() {
			return imageUrl;
		}
		public void setImageUrl(String imageUrl) {
			this.imageUrl = imageUrl;
		}
		public String getCreatedAt() {
			return createdAt;
		}
		public void setCreatedAt(String createdAt) {
			this.createdAt = createdAt;
		}
		public String getUpdatedAt() {
			return updatedAt;
		}
		public void setUpdatedAt(String updatedAt) {
			this.updatedAt = updatedAt;
		}
		@Override
		public String toString() {
			return "Data [title=" + title + ", id=" + id + ", description=" + description + ", category=" + category
					+ ", venue=" + venue + ", city=" + city + ", eventDate=" + eventDate + ", price=" + price
					+ ", totalSeats=" + totalSeats + ", availableSeats=" + availableSeats + ", imageUrl=" + imageUrl
					+ ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + "]";
		}
		
		
		

	}

}
