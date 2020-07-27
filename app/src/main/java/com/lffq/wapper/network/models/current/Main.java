package com.lffq.wapper.network.models.current;

import com.google.gson.annotations.SerializedName;

public class Main{

	@SerializedName("temp")
	private Double temp;

	@SerializedName("temp_min")
	private Double tempMin;

	@SerializedName("humidity")
	private Integer humidity;

	@SerializedName("pressure")
	private Integer pressure;

	@SerializedName("feels_like")
	private Double feelsLike;

	@SerializedName("temp_max")
	private Double tempMax;

	public void setTemp(Double temp){
		this.temp = temp;
	}

	public Double getTemp(){
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

	public void setFeelsLike(Double feelsLike){
		this.feelsLike = feelsLike;
	}

	public Double getFeelsLike(){
		return feelsLike;
	}

	public void setTempMax(Double tempMax){
		this.tempMax = tempMax;
	}

	public Double getTempMax(){
		return tempMax;
	}
}