package prajwal.rentalProject.service;

import java.util.List;

import prajwal.rentalProject.entity.Car;

public interface CarService 
{
	public List<Car> getAllCars();
	
	public Car getCarById(String id);
	
	public Car addCar(Car c);
	
	public Car updateCar(String id, Car c);
	
	public void deleteCar(String id);
}
