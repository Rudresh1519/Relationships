package com.java.carsapi.start;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cars {

	@Id
	private String carType;
	private String modelName;
	private int yearOfRegistration;
	private int seatingCapacity;
	private double costPerDay;
	private float mileage;
	private long pinCode;
	private long contactNumber;
	private String emailId;
	
    public Cars() {
		
    }
	
	public Cars(String carType, String modelName, int yearOfRegistration, int seatingCapacity, double costPerDay,
			float mileage, long pinCode, long contactNumber, String emailId) {
		
		super();
		this.carType = carType;
		this.modelName = modelName;
		this.yearOfRegistration = yearOfRegistration;
		this.seatingCapacity = seatingCapacity;
		this.costPerDay = costPerDay;
		this.mileage = mileage;
		this.pinCode = pinCode;
		this.contactNumber = contactNumber;
		this.emailId = emailId;
	}

	public String getCarType() {
		return carType;
	}
	
	public void setCarType(String carType) {
		this.carType = carType;
	}
	
	public String getModelName() {
		return modelName;
	}
	
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	
	public int getYearOfRegistration() {
		return yearOfRegistration;
	}
	
	public void setYearOfRegistration(int yearOfRegistration) {
		this.yearOfRegistration = yearOfRegistration;
	}
	
	public int getSeatingCapacity() {
		return seatingCapacity;
	}
	
	public void setSeatingCapacity(int seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}
	
	public double getCostPerDay() {
		return costPerDay;
	}
	
	public void setCostPerDay(double costPerDay) {
		this.costPerDay = costPerDay;
	}
	
	public float getMileage() {
		return mileage;
	}
	
	public void setMileage(float mileage) {
		this.mileage = mileage;
	}
	
	public long getPinCode() {
		return pinCode;
	}
	
	public void setPinCode(long pinCode) {
		this.pinCode = pinCode;
	}
	
	public long getContactNumber() {
		return contactNumber;
	}
	
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	
	public String getEmailId() {
		return emailId;
	}
	
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	
}
