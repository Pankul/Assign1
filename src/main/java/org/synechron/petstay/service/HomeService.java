package org.synechron.petstay.service;

import java.util.List;

import org.synechron.petstay.model.Home;

interface HomeService {
	
	public List<Home> getHomes();

	public Home getHomeById(int id);

	public List<Home> getHomeByRating(int rating);
	public List<Home> getHomeBetweenRating(int rating1,int rating2);
}
