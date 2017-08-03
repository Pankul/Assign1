package org.synechron.petstay.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.synechron.petstay.dao.DogDao;
import org.synechron.petstay.model.Dog;


@Service
public class DogServiceImpl implements DogService {

	@Autowired
	DogDao dogDao;
	
	@Override
	/*@Transactional*/
	public void saveDog(Dog dog) {
		dogDao.saveDog(dog);	
	}

	@Override
	/*@Transactional*/
	public Dog getDogById(int id) {
		return dogDao.getDogById(id);
	}

	@Override
	/*@Transactional*/
	public List<Dog> getListOfDogs() {
		return dogDao.getListOfDogs();
	}

}
