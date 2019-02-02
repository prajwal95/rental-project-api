package prajwal.rentalProject.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import prajwal.rentalProject.entity.Car;
import prajwal.rentalProject.exception.NotFoundRes;
import prajwal.rentalProject.repository.CarRepo;

@Service
public class CarServiceImpl implements CarService 
{
	@Autowired
	CarRepo cr;

	@Transactional
	public List<Car> getAllCars() {
		// TODO Auto-generated method stub
		return (List<Car>)cr.findAll();
	}

	@Transactional
	public Car getCarById(String id) {
		// TODO Auto-generated method stub
		Optional<Car> c=cr.findById(id);
		if(!c.isPresent())
		{
			throw new NotFoundRes("Car with ID : "+id+" does not exist");
		}
		return c.get();
	}

	@Transactional
	public Car addCar(Car c) {
		// TODO Auto-generated method stub
		
		return cr.save(c);
		
	}

	@Transactional
	public Car updateCar(String id, Car c) {
		Optional<Car> temp=cr.findById(id);
		if(!temp.isPresent())
		{
			throw new NotFoundRes("Car with ID : "+id+" does not exist..cannot be updated");
		}
		return cr.save(c);
	}

	@Transactional
	public void deleteCar(String id) {
		// TODO Auto-generated method stub
		cr.deleteById(id);
	}
	
	
}
