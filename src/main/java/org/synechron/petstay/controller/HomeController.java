package org.synechron.petstay.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.synechron.petstay.model.Home;
import org.synechron.petstay.service.HomeServiceImpl;

@RestController
public class HomeController {
	
	@Autowired()
	HomeServiceImpl homeService;

	@GetMapping("/homes")
	public List<Home> gethomes() {
		return homeService.getHomes();
	}

	@GetMapping("/homes/{id}")
	public ResponseEntity<Home> gethomeById(@PathVariable("id") int id) {

		Home home = homeService.getHomeById(id);
		if (home == null) {
			return new ResponseEntity<Home>(home, HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity<Home>(home, HttpStatus.OK);
	}
	
	@GetMapping("/homeByRating/{rating}")
	public ResponseEntity <List<Home>> gethomeByRating(@PathVariable("rating") int rating) {

		List<Home> home = homeService.getHomeByRating(rating);
		if (home == null) {
			return new ResponseEntity<List<Home>>( home, HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity<List<Home>>(home, HttpStatus.OK);
	}
	
	@GetMapping("/homeBetweenRating/{rating}/{rating1}")
	public ResponseEntity <List<Home>> gethomeByRatingBetween(@PathVariable("rating") int rating1,@PathVariable("rating1") int rating2) {

		List<Home> home = homeService.getHomeBetweenRating(rating1, rating2);
		if (home == null) {
			return new ResponseEntity<List<Home>>( home, HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity<List<Home>>(home, HttpStatus.OK);
	}

}
