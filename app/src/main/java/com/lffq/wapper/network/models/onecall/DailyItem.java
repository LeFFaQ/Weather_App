package com.lffq.wapper.network.models.onecall;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DailyItem{

	@SerializedName("rain")
	private Double rain;

	@SerializedName("sunrise")
	private Integer sunrise;

	@SerializedName("temp")
	private Temp temp;

	@SerializedName("uvi")
	private Double uvi;

	@SerializedName("pressure")
	private Integer pressure;

	@SerializedName("clouds")
	private Integer clouds;

	@SerializedName("feels_like")
	private FeelsLike feelsLike;

	@SerializedName("dt")
	private Integer dt;

	@SerializedName("pop")
	private Double pop;

	@SerializedName("wind_deg")
	private Integer windDeg;

	@SerializedName("dew_point")
	private Double dewPoint;

	@SerializedName("sunset")
	private Integer sunset;

	@SerializedName("weather")
	private List<WeatherItem> weather;

	@SerializedName("humidity")
	private Integer humidity;

	@SerializedName("wind_speed")
	private Double windSpeed;

	public Double getRain(){
		return rain;
	}

	public Integer getSunrise(){
		return sunrise;
	}

	public Temp getTemp(){
		return temp;
	}

	public Double getUvi(){
		return uvi;
	}

	public Integer getPressure(){
		return pressure;
	}

	public Integer getClouds(){
		return clouds;
	}

	public FeelsLike getFeelsLike(){
		return feelsLike;
	}

	public Integer getDt(){
		return dt;
	}

	public Double getPop(){
		return pop;
	}

	public Integer getWindDeg(){
		return windDeg;
	}

	public Double getDewPoint(){
		return dewPoint;
	}

	public Integer getSunset(){
		return sunset;
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
}