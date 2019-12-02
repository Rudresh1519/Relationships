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
public class CarController {

	@Autowired
	private CarService carService;
	
	@RequestMapping("/car")
	public List<Cars> getAllCar()
	{
		return carService.getAllCar();
	}
	
	@RequestMapping("/car/{CarType}")
	public Optional<Cars> getCar(@PathVariable String CarType)
	{
		return carService.getCar(CarType);
	}
	
	@RequestMapping(method = RequestMethod.POST , value="/car")
	public void addCar(@RequestBody Cars cars)
	{
		carService.addCar(cars);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/car/{CarType}")
	public void updateCar(@RequestBody Cars cars, @PathVariable String CarType)
	{
		carService.updateCar(CarType, cars);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/car/{CarType}")
	public void deleteCar(@PathVariable String CarType)
	{
		carService.deleteCar(CarType);
	}
}
