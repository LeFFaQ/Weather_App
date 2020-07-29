package com.lffq.wapper.network.models.current;

import com.google.gson.annotations.SerializedName;

public class Wind{

	@SerializedName("deg")
	private Integer deg;

	@SerializedName("speed")
	private Float speed;

	public void setDeg(Integer deg){
		this.deg = deg;
	}

	public Integer getDeg(){
		return deg;
	}

	public void setSpeed(Float speed){
		this.speed = speed;
	}

	public Float getSpeed(){
		return speed;
	}
}