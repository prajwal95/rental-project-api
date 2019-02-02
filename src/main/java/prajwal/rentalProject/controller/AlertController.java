package prajwal.rentalProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import prajwal.rentalProject.entity.Alert;
import prajwal.rentalProject.service.AlertService;

@RestController
@RequestMapping(value="/alert")
public class AlertController 
{
	
	@Autowired
	AlertService as;

	@RequestMapping(method=RequestMethod.GET, value="", 
					produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<Alert> getAllAlerts()
	{
		return null;	
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/{aid}", 
	        consumes=MediaType.APPLICATION_JSON_UTF8_VALUE, produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Alert getByAlertId(@PathVariable("aid") String id)
	{
		return null;
	}
	
	/*
	public Alert getByVehicleId(String id)
	{
		return null;
	}*/
	
	@RequestMapping(method=RequestMethod.POST, value="", 
	        consumes=MediaType.APPLICATION_JSON_UTF8_VALUE, produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Alert addAlert(Alert a)
	{
		return null;
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/{aid}", 
	        consumes=MediaType.APPLICATION_JSON_UTF8_VALUE, produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public void deleteAlert(@PathVariable("aid") String id)
	{
		
	}
	
}
