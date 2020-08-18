package com.city.connect.service;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

import org.springframework.stereotype.Service;

import com.city.connect.utils.CityConnectionUtils;

/**
 * 
 * @author purushottammaharjan
 * Service Implementation to Two cities are considered connected if there’s a series of roads that can be traveled from one city to another.
 */

@Service
public class ConnectServiceImpl implements ConnectService {


	@Override
	public boolean isCityConnection(String origin, String destination) throws IOException {
		Set<String> visited = new HashSet<>();
		Stack<String> cities = new Stack<>();
		cities.push(origin);
		while (!cities.isEmpty()) {
			String city = cities.pop();
			if (city != null && !visited.contains(city)) {
				visited.add(city);
				if (city.equals(destination)) {
					return true;
				}
				Set<String> neighbors = CityConnectionUtils.createCityConnection().get(city);
				if (neighbors != null) {
					for (String neighbor : neighbors) {
						if (!visited.contains(neighbor)) {
							cities.push(neighbor);
						}
					}
				}
			}
		}
		return false;
	}
	
}
