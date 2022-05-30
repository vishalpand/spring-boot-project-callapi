package com.spring.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.spring.entities.User;

@Service
public class ServiceLayer {

	
	private RestTemplate restTemplate;

	public User API() {
		// TODO Auto-generated method stub
		System.out.println( "hello");
		String url = "https://jsonplaceholder.typicode.com/todos/1";
		restTemplate = new  RestTemplate();
		return restTemplate.getForObject(url, User.class);

	}

}
