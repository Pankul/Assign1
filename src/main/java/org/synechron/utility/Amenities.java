package org.synechron.utility;

public enum Amenities {
	BATH("bath"), SPA("spa"), NAILCUTTING("nail-clipping"), POOL("pool"),HAIRCUT("hair-cut");
	private String amenities;

	private Amenities(String amenities) {
		this.amenities = amenities;
	}

	public String getRoomType() {
		return amenities;
	}

	@Override
	public String toString() {
		return this.amenities;
	}
	}
