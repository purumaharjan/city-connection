package com.city.connect.service;

import java.io.IOException;

public interface ConnectService {
	
	boolean isCityConnection(String origin, String destination) throws IOException;

}
