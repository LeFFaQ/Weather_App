package com.lffq.wapper.network.models.onecall;

import com.google.gson.annotations.SerializedName;

public class Rain{

	@SerializedName("1h")
	private Double jsonMember1h;

	public Double getJsonMember1h(){
		return jsonMember1h;
	}
}