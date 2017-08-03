package org.synechron.petstay.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.synechron.petstay.dao.HomeDao;
import org.synechron.petstay.model.Home;

@Service
public class HomeServiceImpl implements HomeService{

	@Autowired
	HomeDao homeDao;
	
	@Override
	public List<Home> getHomes() {
		return homeDao.getHomes();
	}

	@Override
	public Home getHomeById(int id) {
		return homeDao.getHomeById(id);
	}

	@Override
	public List<Home> getHomeByRating(int rating) {
		return homeDao.getHomeByRating(rating);
	}

	@Override
	public List<Home> getHomeBetweenRating(int rating1, int rating2) {
		return homeDao.getHomeBetweenRating(rating1, rating2)
				;
	}

}
