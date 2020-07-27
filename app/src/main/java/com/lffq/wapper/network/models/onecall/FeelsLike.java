package com.lffq.wapper.network.models.onecall;

import com.google.gson.annotations.SerializedName;

public class FeelsLike{

	@SerializedName("eve")
	private Double eve;

	@SerializedName("night")
	private Double night;

	@SerializedName("day")
	private Double day;

	@SerializedName("morn")
	private Double morn;

	public Double getEve(){
		return eve;
	}

	public Double getNight(){
		return night;
	}

	public Double getDay(){
		return day;
	}

	public Double getMorn(){
		return morn;
	}
}