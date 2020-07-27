package com.lffq.wapper.network.models.current;

import com.google.gson.annotations.SerializedName;

public class Sys{

	@SerializedName("country")
	private String country;

	@SerializedName("sunrise")
	private Integer sunrise;

	@SerializedName("sunset")
	private Integer sunset;

	@SerializedName("id")
	private Integer id;

	@SerializedName("type")
	private Integer type;

	public void setCountry(String country){
		this.country = country;
	}

	public String getCountry(){
		return country;
	}

	public void setSunrise(Integer sunrise){
		this.sunrise = sunrise;
	}

	public Integer getSunrise(){
		return sunrise;
	}

	public void setSunset(Integer sunset){
		this.sunset = sunset;
	}

	public Integer getSunset(){
		return sunset;
	}

	public void setId(Integer id){
		this.id = id;
	}

	public Integer getId(){
		return id;
	}

	public void setType(Integer type){
		this.type = type;
	}

	public Integer getType(){
		return type;
	}
}