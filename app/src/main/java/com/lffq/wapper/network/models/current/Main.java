package com.lffq.wapper.network.models.current;

import com.google.gson.annotations.SerializedName;

public class Main{

	@SerializedName("temp")
	private Float temp;

	@SerializedName("temp_min")
	private Double tempMin;

	@SerializedName("humidity")
	private Integer humidity;

	@SerializedName("pressure")
	private Integer pressure;

	@SerializedName("feels_like")
	private Float feelsLike;

	@SerializedName("temp_max")
	private Double tempMax;

	public void setTemp(Float temp){
		this.temp = temp;
	}

	public Float getTemp(){
		return temp;
	}

	public void setTempMin(Double tempMin){
		this.tempMin = tempMin;
	}

	public Double getTempMin(){
		return tempMin;
	}

	public void setHumidity(Integer humidity){
		this.humidity = humidity;
	}

	public Integer getHumidity(){
		return humidity;
	}

	public void setPressure(Integer pressure){
		this.pressure = pressure;
	}

	public Integer getPressure(){
		return pressure;
	}

	public void setFeelsLike(Float feelsLike){
		this.feelsLike = feelsLike;
	}

	public Float getFeelsLike(){
		return feelsLike;
	}

	public void setTempMax(Double tempMax){
		this.tempMax = tempMax;
	}

	public Double getTempMax(){
		return tempMax;
	}
}