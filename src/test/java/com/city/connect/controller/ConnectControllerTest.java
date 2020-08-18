package com.city.connect.controller;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.city.connect.service.ConnectService;

public class ConnectControllerTest {
	
	@Mock
	private ConnectService connectService;

	@InjectMocks
	private ConnectController connectController;

	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testCityConnected() throws IOException {
		String origin = "Boston";
		String destination = "Newark";
		
		when(connectService.isCityConnection(origin, destination)).thenReturn(true);
		String isConnected = connectController.getCityConnected(origin, destination);
		
		assertEquals(isConnected, "YES");
		
	}
	
	@Test
	public void testCityNotConnected() throws IOException {
		String origin = "Philadelphia";
		String destination = "Albany";
		
		when(connectService.isCityConnection(origin, destination)).thenReturn(false);
		String isConnected = connectController.getCityConnected(origin, destination);
		
		assertEquals(isConnected, "NO");
		
	}


}
