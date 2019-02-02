package prajwal.rentalProject.repository;

import org.springframework.data.repository.CrudRepository;

import prajwal.rentalProject.entity.Car;

public interface CarRepo extends CrudRepository<Car, String>
{

}
