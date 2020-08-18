package com.city.connect.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.city.connect.service.ConnectService;
import com.city.connect.utils.Connected;

/**
 * 
 * @author purushottammaharjan
 * RestController class to bind the request and response with Getmapping
 */

@RestController
public class ConnectController {
	
	@Autowired
	private ConnectService connectService;
	
	@GetMapping("/connected")
	public String getCityConnected(@RequestParam("origin") String origin,  @RequestParam("destination") String destination) {
		boolean isConnected = false;
		try {
			isConnected = connectService.isCityConnection(origin, destination);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return isConnected ? Connected.YES.toString() : Connected.NO.toString();
		
	}

}
