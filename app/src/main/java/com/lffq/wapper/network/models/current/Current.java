package com.lffq.wapper.network.models.current;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Current{

	@SerializedName("visibility")
	private Integer visibility;

	@SerializedName("timezone")
	private Integer timezone;

	@SerializedName("main")
	private Main main;

	@SerializedName("clouds")
	private Clouds clouds;

	@SerializedName("sys")
	private Sys sys;

	@SerializedName("dt")
	private Integer dt;

	@SerializedName("coord")
	private Coord coord;

	@SerializedName("weather")
	private List<WeatherItem> weather;

	@SerializedName("name")
	private String name;

	@SerializedName("cod")
	private Integer cod;

	@SerializedName("id")
	private Integer id;

	@SerializedName("base")
	private String base;

	@SerializedName("wind")
	private Wind wind;

	public void setVisibility(Integer visibility){
		this.visibility = visibility;
	}

	public Integer getVisibility(){
		return visibility;
	}

	public void setTimezone(Integer timezone){
		this.timezone = timezone;
	}

	public Integer getTimezone(){
		return timezone;
	}

	public void setMain(Main main){
		this.main = main;
	}

	public Main getMain(){
		return main;
	}

	public void setClouds(Clouds clouds){
		this.clouds = clouds;
	}

	public Clouds getClouds(){
		return clouds;
	}

	public void setSys(Sys sys){
		this.sys = sys;
	}

	public Sys getSys(){
		return sys;
	}

	public void setDt(Integer dt){
		this.dt = dt;
	}

	public Integer getDt(){
		return dt;
	}

	public void setCoord(Coord coord){
		this.coord = coord;
	}

	public Coord getCoord(){
		return coord;
	}

	public void setWeather(List<WeatherItem> weather){
		this.weather = weather;
	}

	public List<WeatherItem> getWeather(){
		return weather;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setCod(Integer cod){
		this.cod = cod;
	}

	public Integer getCod(){
		return cod;
	}

	public void setId(Integer id){
		this.id = id;
	}

	public Integer getId(){
		return id;
	}

	public void setBase(String base){
		this.base = base;
	}

	public String getBase(){
		return base;
	}

	public void setWind(Wind wind){
		this.wind = wind;
	}

	public Wind getWind(){
		return wind;
	}
}