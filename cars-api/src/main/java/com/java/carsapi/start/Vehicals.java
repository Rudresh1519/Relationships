package com.java.carsapi.start;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Vehicals {
     
	 @Id
     int vehicalId;
     String vehicalModel;
     int fuelCapacity;
     int length;
     int breadth;
     int height;
     
       @ManyToOne
      @JoinColumn(name = "locationId", nullable = false)
       private Locations locations;
     
     
     public Locations getLocations() {
		return locations;
	}

	public void setLocations(Locations locations) {
		this.locations = locations;
	} 

	public Vehicals()
     {
      
      }
     
	public Vehicals(int vehicalId, String vehicalModel, int fuelCapacity, int length, int breadth, int height,Locations locations) {
		
		super();
		this.vehicalId = vehicalId;
		this.vehicalModel = vehicalModel;
		this.fuelCapacity = fuelCapacity;
		this.length = length;
		this.breadth = breadth;
		this.height = height;
		this.locations = locations;
	}

	public int getVehicalId() {
		return vehicalId;
	}
	
	public void setVehicalId(int vehicalId) {
		this.vehicalId = vehicalId;
	}
	
	public String getVehicalModel() {
		return vehicalModel;
	}
	
	public void setVehicalModel(String vehicalModel) {
		this.vehicalModel = vehicalModel;
	}
	
	public int getFuelCapacity() {
		return fuelCapacity;
	}
	
	public void setFuelCapacity(int fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}
	
	public int getLength() {
		return length;
	}
	
	public void setLength(int length) {
		this.length = length;
	}
	
	public int getBreadth() {
		return breadth;
	}
	
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
 	
     
     
}
