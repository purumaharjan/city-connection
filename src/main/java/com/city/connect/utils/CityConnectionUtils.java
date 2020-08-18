package com.city.connect.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.util.ResourceUtils;

public class CityConnectionUtils {
	
	private static final String CITY_TXT_FILE = "city.txt";
	public static final String CLASSPATH = "classpath:";
	public static final String FILE = "file:";

	public static Map<String, Set<String>> createCityConnection() throws IOException {

		Map<String, Set<String>> connectedCities = new HashMap<>();
		List<String> lines = Files.readAllLines(buildFilePath(CLASSPATH + CITY_TXT_FILE).toPath());
		
		for (String line : lines) {
			String[] words = line.split(", ");
			String leftCity = words[0];
			String rightCity = words[1];
			
			Set<String> leftCityNeighbors = connectedCities.getOrDefault(leftCity, new HashSet<>());
			leftCityNeighbors.add(rightCity);
			connectedCities.put(leftCity, leftCityNeighbors);
			
			Set<String> rightCityNeighbors = connectedCities.getOrDefault(rightCity, new HashSet<>());
			rightCityNeighbors.add(leftCity);
			connectedCities.put(rightCity, rightCityNeighbors);
		}

		return connectedCities;
	}
	
	public static File buildFilePath(String filePath) throws FileNotFoundException {
		File file;
		if (!filePath.startsWith(CLASSPATH) && !filePath.startsWith(FILE)) {
			file = ResourceUtils.getFile(CLASSPATH + filePath);
		} else {
			file = ResourceUtils.getFile(filePath);
		}
		return file;
	}

}
