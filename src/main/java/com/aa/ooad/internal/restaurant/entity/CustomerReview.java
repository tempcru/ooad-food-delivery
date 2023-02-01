package com.aa.ooad.internal.restaurant.entity;

public class CustomerReview {

	private String customerId;
	private String restaurantId;
	private int starPoint;
	private String reviewDescription;
	
	public CustomerReview(String customerId, String restaurantId, int starPoint, String reviewDescription) {
		super();
		this.customerId = customerId;
		this.restaurantId = restaurantId;
		this.starPoint = starPoint;
		this.reviewDescription = reviewDescription;
	}
	
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getRestaurantId() {
		return restaurantId;
	}
	public void setRestaurantId(String restaurantId) {
		this.restaurantId = restaurantId;
	}
	public int getStarPoint() {
		return starPoint;
	}
	public void setStarPoint(int starPoint) {
		this.starPoint = starPoint;
	}
	public String getReviewDescription() {
		return reviewDescription;
	}
	public void setReviewDescription(String reviewDescription) {
		this.reviewDescription = reviewDescription;
	}
	
}
