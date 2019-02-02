package prajwal.rentalProject.entity;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Alert 
{
@Id
String id;

String priority;

public String getPriority() {
	return priority;
}

public void setPriority(String priority) {
	this.priority = priority;
}

String reason;

public Alert()
{
	id=UUID.randomUUID().toString();
}

public String getId() {
	return id;
}

public String getReason() {
	return reason;
}

public void setReason(String reason) {
	this.reason = reason;
}

}
