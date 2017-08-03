package org.synechron.petstay.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.synechron.petstay.model.Dog;
import org.synechron.petstay.service.DogService;

@RestController
public class DogController {
	
	@Autowired()
	DogService dogService;
		
	@PostMapping(value = "/saveDogs")
	public ResponseEntity<Dog> createDog(@RequestBody Dog dog) {
	if(dog!=null)
			dogService.saveDog(dog);
		return new ResponseEntity<Dog>(dog, HttpStatus.OK);
	}

	@GetMapping("/dogs")
	public List<Dog> getDogs() {
		return dogService.getListOfDogs();
	}

	@GetMapping("/dogs/{id}")
	public ResponseEntity<Dog> getDogById(@PathVariable("id") int id) {
		Dog dog = dogService.getDogById(id);
		if (dog == null) {
			return new ResponseEntity<Dog>(dog, HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Dog>(dog, HttpStatus.OK);
	}

	
	
		
	
	
	

}
