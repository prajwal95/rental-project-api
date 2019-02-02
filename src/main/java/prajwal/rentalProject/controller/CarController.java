package prajwal.rentalProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import prajwal.rentalProject.entity.Car;
import prajwal.rentalProject.service.CarService;

@RestController
@RequestMapping(value="/car")
@Api(value="/car", description="Operations on cars")
public class CarController 
{
	@Autowired
	CarService cs;
	
	@RequestMapping(method=RequestMethod.GET, value="", 
			        produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ApiOperation(value="/car", notes="Get details of all cars")
	@ApiResponses(value= {@ApiResponse(code=200,message="GET Successful")})
	public List<Car> getAllCars() {
		// TODO Auto-generated method stub
		
		return cs.getAllCars();
	}

	@RequestMapping(method=RequestMethod.GET, value="/{vid}", 
			        consumes=MediaType.APPLICATION_JSON_UTF8_VALUE, produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ApiOperation(value="/car/vid", notes="Get details of car by id")
	@ApiResponses(value= {@ApiResponse(code=200,message="GET Successful")})
	public Car getCarById(@PathVariable("vid") String id) {
		// TODO Auto-generated method stub
		return cs.getCarById(id);
	}
    
	@RequestMapping(method=RequestMethod.POST, value="", 
	        consumes=MediaType.APPLICATION_JSON_UTF8_VALUE, produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ApiOperation(value="/car", notes="Posted details of car")
	@ApiResponses(value= {@ApiResponse(code=200,message="POST Successful")})
	public Car addCar(@RequestBody Car c) {
		// TODO Auto-generated method stub
		return cs.addCar(c);
	}

	@RequestMapping(method=RequestMethod.PUT, value="/{vid}", 
	        consumes=MediaType.APPLICATION_JSON_UTF8_VALUE, produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ApiOperation(value="/car/vid", notes="Details of car updated")
	@ApiResponses(value= {@ApiResponse(code=200,message="PUT Successful")})
	public Car updateCar(@PathVariable("vid") String id, @RequestBody Car c) {
		// TODO Auto-generated method stub
		return cs.updateCar(id, c);
	}

	@RequestMapping(method=RequestMethod.DELETE, value="/{vid}", 
	        consumes=MediaType.APPLICATION_JSON_UTF8_VALUE, produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ApiOperation(value="/car/vid", notes="Details of car deleted")
	@ApiResponses(value= {@ApiResponse(code=200,message="DELETE Successful")})
	public void deleteCar(@PathVariable("vid") String id) {
		// TODO Auto-generated method stub
		cs.deleteCar(id);
	}
	
}
