package com.lffq.wapper.network.models.onecall;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class OneCall{

	@SerializedName("timezone")
	private String timezone;

	@SerializedName("timezone_offset")
	private Integer timezoneOffset;

	@SerializedName("daily")
	private List<DailyItem> daily;

	@SerializedName("lon")
	private Double lon;

	@SerializedName("hourly")
	private List<HourlyItem> hourly;

	@SerializedName("lat")
	private Double lat;

	public String getTimezone(){
		return timezone;
	}

	public Integer getTimezoneOffset(){
		return timezoneOffset;
	}

	public List<DailyItem> getDaily(){
		return daily;
	}

	public Double getLon(){
		return lon;
	}

	public List<HourlyItem> getHourly(){
		return hourly;
	}

	public Double getLat(){
		return lat;
	}
}