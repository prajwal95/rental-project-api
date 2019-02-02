package prajwal.rentalProject.repository;

import org.springframework.data.repository.CrudRepository;

import prajwal.rentalProject.entity.Reading;

public interface ReadingRepo extends CrudRepository<Reading, String>
{
	
}
