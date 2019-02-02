package prajwal.rentalProject.service;

import java.util.List;

import prajwal.rentalProject.entity.Reading;

public interface ReadService 
{
	public List<Reading> getAllReadings();
	
	public Reading getReadingById(String id);
	
	public Reading addReading(Reading r);
	
	public Reading updateReading(String id, Reading r);
	
	public void deleteReading(String id);
}
