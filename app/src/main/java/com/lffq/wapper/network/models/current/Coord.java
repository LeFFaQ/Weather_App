package com.lffq.wapper.network.models.current;

import com.google.gson.annotations.SerializedName;

public class Coord{

	@SerializedName("lon")
	private Float lon;

	@SerializedName("lat")
	private Float lat;

	public void setLon(Float lon){
		this.lon = lon;
	}

	public Float getLon(){
		return lon;
	}

	public void setLat(Float lat){
		this.lat = lat;
	}

	public Float getLat(){
		return lat;
	}
}