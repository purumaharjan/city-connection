package com.city.connect.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.city.connect.service.CreateGraph;

@RestController
public class ConnectController {
	
	@GetMapping("/connected")
	public String getCityConnected(@RequestParam("origin") String origin,  @RequestParam("destination") String destination) {
		
		CreateGraph.createGraph();
		return  origin + " >>" + destination;
	}

}
