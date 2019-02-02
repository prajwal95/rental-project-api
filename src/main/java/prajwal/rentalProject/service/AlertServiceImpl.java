package prajwal.rentalProject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import prajwal.rentalProject.entity.Alert;
import prajwal.rentalProject.entity.Car;
import prajwal.rentalProject.entity.Reading;
import prajwal.rentalProject.entity.Tire;
import prajwal.rentalProject.repository.AlertRepo;

@Service
public class AlertServiceImpl implements AlertService
{

	@Autowired
	AlertRepo ar;
	
	public List<Alert> getAllAlerts() {
		// TODO Auto-generated method stub
		return null;
	}

	public Alert getAlertById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Alert addAlert(Alert c) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteAlert(String id) {
		// TODO Auto-generated method stub
		
	}

	public void checkForAlerts(Car c, Reading r) {
		// TODO Auto-generated method stub
		
		if(r.getEngineRpm()>c.getRedlineRpm())
		{
			Alert a=new Alert();
			a.setPriority("HIGH");
			a.setReason("RPM is greater than RedlineRPM");
			
			ar.save(a);
		}
		
		if(r.getFuel()<(.10*c.getMaxFuel()))
		{
			Alert a=new Alert();
			a.setPriority("MEDIUM");
			a.setReason("Refueling Required");
			
			ar.save(a);
		}
		
		if(r.isCheckEngineLightOn() || r.isEngineCoolantLow())
		{
			Alert a=new Alert();
			a.setPriority("LOW");
			a.setReason("Check coolant or engine");
			
			ar.save(a);
		}
		
		
	}

}
