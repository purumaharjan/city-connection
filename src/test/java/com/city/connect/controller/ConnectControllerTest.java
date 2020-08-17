package com.city.connect.controller;

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
	public void testConnection() {
		
	}


}
