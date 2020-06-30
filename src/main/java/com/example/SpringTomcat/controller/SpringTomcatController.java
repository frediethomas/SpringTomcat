package com.example.SpringTomcat.controller;

import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.GetMapping;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;

@RestController

public class SpringTomcatController {

	@GetMapping("/helloTomcat")
	public String helloTom() {		
	    
		System.out.println("Hello Tomcat");
		
		Client client1 = ClientBuilder.newClient();
		System.out.println("setting client");
		String name = client1.target("http://rating:8082/Hello")
		        .request(MediaType.TEXT_PLAIN)
		        .get(String.class);
		
		return "Hello Tomcat Headers";
	}
}
