package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.entities.User;
import com.spring.service.ServiceLayer;

@RestController
@RequestMapping("/home")
public class HomeController {

	@Autowired
	private ServiceLayer serviceLayer;
	
    @GetMapping("/getData")
	public User getData()
	{
    	 System.out.println("hello");
    	 return serviceLayer.API();
		 
	}
}
