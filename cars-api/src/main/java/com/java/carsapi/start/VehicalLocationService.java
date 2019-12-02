package com.java.carsapi.start;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicalLocationService {

	@Autowired
	VehicalsRepository vehicalrepository;
	@Autowired
	LocationsRepository locationrepository;
	
	public List<Vehicals> getAllVehical() {
		
		return (List<Vehicals>) vehicalrepository.findAll();
	}

	public Optional<Vehicals> getVehical(int vehicalId) {
		
		return vehicalrepository.findById(vehicalId);
	}

	public void addVehical(Vehicals vehical) {
		
		vehicalrepository.save(vehical);
	}

	public void updateVehical(int vehicalId, Vehicals vehical) {
		
		vehicalrepository.save(vehical);
	}

	public void deleteVehical(int vehicalId) {
		
		vehicalrepository.deleteById(vehicalId);;
	}

	public List<Locations> getAllLocation() {
		
		return (List<Locations>) locationrepository.findAll();
	}

	public Optional<Locations> getLocation(int locationId) {
		
		return locationrepository.findById(locationId);
	}

	public void addLocation(Locations location) {
		
		locationrepository.save(location);
	}

	public void updateLocation(int locationId, Locations location) {
		
		locationrepository.save(location);
	}

	public void deleteLocation(int locationId) {
		
		locationrepository.deleteById(locationId);
		
	}
	
	
	
	
  
	
	
	
	
}
