package org.synechron.petstay.service;

import java.util.List;

import org.synechron.petstay.model.Dog;
import org.synechron.petstay.model.Home;

public interface DogService {

	public void saveDog(Dog dog);
	
	public Dog getDogById(int id);
	
	public List<Dog> getListOfDogs();
	
	
	
}