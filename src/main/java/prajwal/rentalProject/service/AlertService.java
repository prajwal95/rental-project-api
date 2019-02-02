package prajwal.rentalProject.service;

import java.util.List;

import prajwal.rentalProject.entity.Alert;
import prajwal.rentalProject.entity.Car;
import prajwal.rentalProject.entity.Reading;


public interface AlertService 
{
	public List<Alert> getAllAlerts();
	
	public Alert getAlertById(String id);
	
	public Alert addAlert(Alert c);
	
	public void deleteAlert(String id);
	
	public void checkForAlerts(Car c, Reading r);
}
