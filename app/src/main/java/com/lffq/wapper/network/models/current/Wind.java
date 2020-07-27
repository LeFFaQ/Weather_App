package com.lffq.wapper.network.models.current;

import com.google.gson.annotations.SerializedName;

public class Wind{

	@SerializedName("deg")
	private Integer deg;

	@SerializedName("speed")
	private Integer speed;

	public void setDeg(Integer deg){
		this.deg = deg;
	}

	public Integer getDeg(){
		return deg;
	}

	public void setSpeed(Integer speed){
		this.speed = speed;
	}

	public Integer getSpeed(){
		return speed;
	}
}