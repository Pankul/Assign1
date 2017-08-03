package org.synechron.petstay.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.synechron.petstay.model.Dog;

@Repository
public class DogDaoImpl implements DogDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void saveDog(Dog dog) {
		Session session = this.sessionFactory.openSession();
		if(dog!=null)
		{
			session.save(dog);
		}
	}

	@Override
	public Dog getDogById(int id) {	
		Session session = this.sessionFactory.openSession();
			Dog dog=(Dog)session.get(Dog.class, new Integer(id));
			return dog;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Dog> getListOfDogs() {
		Session session = this.sessionFactory.openSession();
		List<Dog> dogs=session.createQuery("from Dog").list();
		return dogs;
	}
	
	
	}
