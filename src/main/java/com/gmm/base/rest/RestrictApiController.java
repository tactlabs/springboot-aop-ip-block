package com.gmm.base.rest;
/*
 * Author: Muthu Mariyappan
 * Date : 05.07.2018
 * Target and business logic, simple class with setter and getter methods
 * Aspect will block all setter methods allowing only getter methods
 * */

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestrictApiController {

	private String firstName,lastName;
	
	RestrictApiController(){
		this.firstName = "Harry";
		this.lastName = "Potter";
	}
	
	RestrictApiController(String fname,String lname){
		this.firstName = fname;
		this.lastName = lname;
	}
	
	@RequestMapping(value = "/set/fname",method=RequestMethod.GET)  
    public void setFirstName(@RequestParam("value") String name){
    	this.firstName = name;
    }
    
	@RequestMapping(value = "/set/lname")  
    public void setLastName(@RequestParam("value") String name){
    	this.lastName = name;
    }
    
	@RequestMapping(value = "/get/fname")  
    public String getFirstName(){
    	return "<h2>First name is "+this.firstName+"</h2>";
    }
    
	@RequestMapping(value = "/get/lname")  
    public String getLastName(){
    	return "<h2>Last name is "+this.lastName+"</h2>";
    }
	
	@RequestMapping(value = "/get/fullname")  
    public String getFullName(){
    	return "<h2>Full name is "+this.firstName+" "+this.lastName+"</h2>";
    }
}