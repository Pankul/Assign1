package org.synechron.petstay.dao;

import java.util.List;

import org.synechron.petstay.model.Dog;

public interface DogDao {

	public void saveDog(Dog dog);
	
	public Dog getDogById(int id);
	
	public List<Dog> getListOfDogs();
	
}
