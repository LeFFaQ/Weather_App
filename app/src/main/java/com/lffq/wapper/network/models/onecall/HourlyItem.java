package com.lffq.wapper.network.models.onecall;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class HourlyItem{

	@SerializedName("dt")
	private Integer dt;

	@SerializedName("pop")
	private Integer pop;

	@SerializedName("temp")
	private Double temp;

	@SerializedName("wind_deg")
	private Integer windDeg;

	@SerializedName("visibility")
	private Integer visibility;

	@SerializedName("dew_point")
	private Double dewPoint;

	@SerializedName("weather")
	private List<WeatherItem> weather;

	@SerializedName("humidity")
	private Integer humidity;

	@SerializedName("wind_speed")
	private Double windSpeed;

	@SerializedName("pressure")
	private Integer pressure;

	@SerializedName("clouds")
	private Integer clouds;

	@SerializedName("feels_like")
	private Double feelsLike;

	@SerializedName("rain")
	private Rain rain;

	public Integer getDt(){
		return dt;
	}

	public Integer getPop(){
		return pop;
	}

	public Double getTemp(){
		return temp;
	}

	public Integer getWindDeg(){
		return windDeg;
	}

	public Integer getVisibility(){
		return visibility;
	}

	public Double getDewPoint(){
		return dewPoint;
	}

	public List<WeatherItem> getWeather(){
		return weather;
	}

	public Integer getHumidity(){
		return humidity;
	}

	public Double getWindSpeed(){
		return windSpeed;
	}

	public Integer getPressure(){
		return pressure;
	}

	public Integer getClouds(){
		return clouds;
	}

	public Double getFeelsLike(){
		return feelsLike;
	}

	public Rain getRain(){
		return rain;
	}
}