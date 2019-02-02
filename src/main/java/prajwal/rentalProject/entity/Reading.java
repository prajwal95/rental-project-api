package prajwal.rentalProject.entity;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Reading 
{
@Id
String id;

double latitude;
double longitude;
String timestamp;

double fuel;
int speed;
int engineHp;
int engineRpm;

boolean checkEngineLightOn;
boolean engineCoolantLow;
boolean cruiseControlOn;

@Embedded
Tire t;

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public double getLatitude() {
	return latitude;
}

public void setLatitude(double latitude) {
	this.latitude = latitude;
}

public double getLongitude() {
	return longitude;
}

public void setLongitude(double longitude) {
	this.longitude = longitude;
}

public String getTimestamp() {
	return timestamp;
}

public void setTimestamp(String timestamp) {
	this.timestamp = timestamp;
}

public double getFuel() {
	return fuel;
}

public void setFuel(double fuel) {
	this.fuel = fuel;
}

public int getSpeed() {
	return speed;
}

public void setSpeed(int speed) {
	this.speed = speed;
}

public int getEngineHp() {
	return engineHp;
}

public void setEngineHp(int engineHp) {
	this.engineHp = engineHp;
}

public int getEngineRpm() {
	return engineRpm;
}

public void setEngineRpm(int engineRpm) {
	this.engineRpm = engineRpm;
}

public boolean isCheckEngineLightOn() {
	return checkEngineLightOn;
}

public void setCheckEngineLightOn(boolean checkEngineLightOn) {
	this.checkEngineLightOn = checkEngineLightOn;
}

public boolean isEngineCoolantLow() {
	return engineCoolantLow;
}

public void setEngineCoolantLow(boolean engineCoolantLow) {
	this.engineCoolantLow = engineCoolantLow;
}

public boolean isCruiseControlOn() {
	return cruiseControlOn;
}

public void setCruiseControlOn(boolean cruiseControlOn) {
	this.cruiseControlOn = cruiseControlOn;
}

public Tire getT() {
	return t;
}

public void setT(Tire t) {
	this.t = t;
}
}
