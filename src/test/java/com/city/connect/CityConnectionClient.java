package com.city.connect;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

public class CityConnectionClient {

	public static final String REST_SERVICE_URI = "http://localhost:8080/connected";

	private static String getConnectionStatus(String origin, String destination) {

		HttpHeaders headers = new HttpHeaders();
		headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);

		UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(REST_SERVICE_URI).queryParam("origin", origin)
				.queryParam("destination", destination);

		RestTemplate restTemplate = new RestTemplate();
		HttpEntity<?> entity = new HttpEntity<>(headers);

		HttpEntity<String> response = restTemplate.exchange(builder.toUriString(), HttpMethod.GET, entity,
				String.class);
		
		return response.getBody();
	}

	public static void main(String args[]) {
		
		System.out.print(getConnectionStatus("boston", "Newark"));
		
		

	}

}
