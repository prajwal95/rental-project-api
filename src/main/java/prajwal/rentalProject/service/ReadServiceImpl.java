package prajwal.rentalProject.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import prajwal.rentalProject.entity.Car;
import prajwal.rentalProject.entity.Reading;
import prajwal.rentalProject.exception.NotFoundRes;
import prajwal.rentalProject.repository.CarRepo;
import prajwal.rentalProject.repository.ReadingRepo;

@Service
public class ReadServiceImpl implements ReadService
{
	
	@Autowired
	ReadingRepo rr;
	
	@Autowired
	AlertService as;
	
	@Autowired
	CarRepo cr;
	
	@Transactional
	public List<Reading> getAllReadings()
	{
		return (List<Reading>) rr.findAll();
	}
	
	@Transactional
	public Reading getReadingById(String id)
	{
		Optional<Reading> read=rr.findById(id);
		if(!read.isPresent())
		{
			throw new NotFoundRes("Reading with ID : "+id+" does not exist");
		}
		return read.get();
	}
	
	@Transactional
	public Reading addReading(Reading r)
	{
		rr.save(r);
		
		Optional<Car> tempCar= cr.findById(r.getId());
		if(!tempCar.isPresent()) {throw new NotFoundRes("No such car ID exist");}
		
		as.checkForAlerts(tempCar.get(), r);
		
		return r;
	}
	
	@Transactional
	public Reading updateReading(String id, Reading r)
	{
		Optional<Reading> temp=rr.findById(id);
		if(!temp.isPresent())
		{
			throw new NotFoundRes("Reading with ID : "+id+" does not exist..cannot be updated");
		}
		return rr.save(r);
	}
	
	@Transactional
	public void deleteReading(String id)
	{
		rr.deleteById(id);
	}
}
