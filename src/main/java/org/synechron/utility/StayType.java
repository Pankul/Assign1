package org.synechron.utility;

import java.io.Serializable;

public enum StayType implements Serializable {

	ECONOMY("economy"), LUXURY("luxury"), DELUX("delux"), STANDARD("standard");

	private String stayType;

	private StayType(String stayType) {
		this.stayType = stayType;
	}

	public String getRoomType() {
		return stayType;
	}

	@Override
	public String toString() {
		return this.stayType;
	}
}
