package prajwal.rentalProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import prajwal.rentalProject.entity.Reading;
import prajwal.rentalProject.service.ReadService;

@RestController
@RequestMapping(value="/reading")
public class ReadingController 
{

	@Autowired
	ReadService rs;
	
	@RequestMapping(method=RequestMethod.GET, value="", 
			consumes=MediaType.APPLICATION_JSON_UTF8_VALUE, produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<Reading> getAllReadings()
	{
		return rs.getAllReadings();
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/{vid}", 
			consumes=MediaType.APPLICATION_JSON_UTF8_VALUE, produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Reading getReadingById(@PathVariable("vid") String id)
	{
		return rs.getReadingById(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="", 
			consumes=MediaType.APPLICATION_JSON_UTF8_VALUE, produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Reading addReading(@RequestBody Reading r)
	{
		return rs.addReading(r);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/{vid}", 
			consumes=MediaType.APPLICATION_JSON_UTF8_VALUE, produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Reading updateReading(@PathVariable("vid") String id, @RequestBody Reading r)
	{
		return rs.updateReading(id, r);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/{vid}", 
			consumes=MediaType.APPLICATION_JSON_UTF8_VALUE, produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public void deleteReading(@PathVariable("vid") String id)
	{
		rs.deleteReading(id);
	}
	
	
}
