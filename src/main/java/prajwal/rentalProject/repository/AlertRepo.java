package prajwal.rentalProject.repository;

import org.springframework.data.repository.CrudRepository;

import prajwal.rentalProject.entity.Alert;

public interface AlertRepo extends CrudRepository<Alert, String>
{

}
