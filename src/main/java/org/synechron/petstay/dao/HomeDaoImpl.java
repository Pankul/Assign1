package org.synechron.petstay.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.synechron.petstay.model.Home;

@Repository
public class HomeDaoImpl implements HomeDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	@Override
	public List<Home> getHomes() {
		Session session = this.sessionFactory.openSession();
		Query query=session.createQuery("from Home where isAvailable=:isAvailable");
		query.setParameter("isAvailable", true);
		List<Home> homes=(List<Home>)query.list();
		return homes;
	}

	@Override
	public Home getHomeById(int id) {
		Session session = this.sessionFactory.openSession();
		Query query=session.createQuery("from Home where isAvailable=:isAvailable and id=:id");
		query.setParameter("isAvailable", true);
		query.setParameter("id", id);
		Home home=(Home)query.uniqueResult();
		return home;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Home> getHomeByRating(int rating) {
		/*query.setParameter("rating", rating);*/
		Session session = this.sessionFactory.openSession();
		List<Home> homes= session.createCriteria(Home.class).add(Restrictions.ge("rating", rating)).list();
		
		return homes;
	}

	@Override
	public List<Home> getHomeBetweenRating(int rating1, int rating2) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.openSession();
		List<Home> homes= session.createCriteria(Home.class).add(Restrictions.between("rating", rating1, rating2)).list();
		
		return homes;
		
	}

}
