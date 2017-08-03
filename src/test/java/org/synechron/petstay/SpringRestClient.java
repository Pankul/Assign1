package org.synechron.petstay;

import org.springframework.web.client.RestTemplate;
import org.synechron.petstay.model.Dog;

public class SpringRestClient {

	public static final String REST_SERVICE_URI = "http://localhost:8080/petstay";
	
	 /* GET */
    private static void getDog(){
        System.out.println("Testing getUser API----------");
        RestTemplate restTemplate = new RestTemplate();
        Dog dog = restTemplate.getForObject(REST_SERVICE_URI+"/dogs/1", Dog.class);
        System.out.println(dog);
    }
    public static void main(String[] args) {
		getDog();
	}
}
