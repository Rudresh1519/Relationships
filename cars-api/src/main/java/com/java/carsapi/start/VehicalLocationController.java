package com.java.carsapi.start;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VehicalLocationController {

	@Autowired
	private VehicalLocationService vehicallocationservice;
	
	@RequestMapping("/Vehical")
	public List<Vehicals> getAllVehical()
	{
		return vehicallocationservice.getAllVehical();
	}
	
	@RequestMapping("/Vehical/{vehicalId}")
	public Optional<Vehicals> getVehical(@PathVariable int vehicalId)
	{
		return vehicallocationservice.getVehical(vehicalId);
	}
	
	@RequestMapping(method = RequestMethod.POST , value = "/Vehical")
	public void addVehical(@RequestBody Vehicals vehical)
	{
		vehicallocationservice.addVehical(vehical);
	}
	
	@RequestMapping(method = RequestMethod.PUT ,value = "/Vehical/{vehicalId}")
	public void updateVehical(@RequestBody Vehicals vehical,@PathVariable int vehicalId)
	{
		vehicallocationservice.updateVehical(vehicalId, vehical);
	}
	
	@RequestMapping(method = RequestMethod.DELETE ,value = "/Vehical/{vehicalId}")
	public void deleteVehical(@PathVariable int vehicalId)
	{
		vehicallocationservice.deleteVehical(vehicalId);
	}
	
	@RequestMapping("/Location")
	public List<Locations> getAllLocation()
	{
		return vehicallocationservice.getAllLocation();
	}
	
	@RequestMapping("/Location/{locationId}")
	public Optional<Locations> getLocation(int locationId)
	{
		return vehicallocationservice.getLocation(locationId);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/Location")
	public void addLocation(@RequestBody Locations location)
	{ 
		vehicallocationservice.addLocation(location);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/Location/locationId")
	public void updateLocation(@RequestBody Locations location, int locationId)
	{
		vehicallocationservice.updateLocation(locationId, location);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/Location/locationId")
	public void deleteLocation(int locationId)
	{
		vehicallocationservice.deleteLocation(locationId);
	}
	
}
