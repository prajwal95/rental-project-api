package prajwal.rentalProject.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class NotFoundRes extends RuntimeException 
{
public NotFoundRes(String s) {
	// TODO Auto-generated constructor stub
	super(s);
}
}
