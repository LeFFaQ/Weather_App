package com.lffq.wapper.network.models.current;

import com.google.gson.annotations.SerializedName;

public class Coord{

	@SerializedName("lon")
	private Integer lon;

	@SerializedName("lat")
	private Integer lat;

	public void setLon(Integer lon){
		this.lon = lon;
	}

	public Integer getLon(){
		return lon;
	}

	public void setLat(Integer lat){
		this.lat = lat;
	}

	public Integer getLat(){
		return lat;
	}
}