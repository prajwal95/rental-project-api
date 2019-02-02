package prajwal.rentalProject.entity;

import javax.persistence.Embeddable;
import javax.persistence.Entity;


@Embeddable

public class Tire 
{
	int frontLeft;
	int frontRight;
	int backLeft;
	int backRight;
	
	
	public int getFrontLeft() {
		return frontLeft;
	}
	public void setFrontLeft(int frontLeft) {
		this.frontLeft = frontLeft;
	}
	public int getFrontRight() {
		return frontRight;
	}
	public void setFrontRight(int frontRight) {
		this.frontRight = frontRight;
	}
	public int getBackLeft() {
		return backLeft;
	}
	public void setBackLeft(int backLeft) {
		this.backLeft = backLeft;
	}
	public int getBackRight() {
		return backRight;
	}
	public void setBackRight(int backRight) {
		this.backRight = backRight;
	}
	
}
