package prajwal.rentalProject.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Car 
{
@Id
String id;

String make;
String model;
int year;
int redlineRpm;
int maxFuel;
String lastServiceDate;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getMake() {
	return make;
}
public void setMake(String make) {
	this.make = make;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public int getRedlineRpm() {
	return redlineRpm;
}
public void setRedlineRpm(int redlineRpm) {
	this.redlineRpm = redlineRpm;
}
public int getMaxFuel() {
	return maxFuel;
}
public void setMaxFuel(int maxFuel) {
	this.maxFuel = maxFuel;
}
public String getLastServiceDate() {
	return lastServiceDate;
}
public void setLastServiceDate(String lastServiceDate) {
	this.lastServiceDate = lastServiceDate;
}


}
