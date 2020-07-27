package com.lffq.wapper.network;

import com.lffq.wapper.network.models.current.Current;
import com.lffq.wapper.network.models.onecall.OneCall;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface OpenWeatherApi {

    @GET("/weather")
    public Call<Current> getCurrent(@Query("lat")Double lat,
                                    @Query("lon")Double lon,
                                    @Query("appid")String Api_key);

    @GET("/onecall")
    public Call<OneCall> getOneCall(@Query("lat")Double lat,
                                    @Query("lon")Double lon,
                                    @Query("exclude") String exclude,
                                    @Query("appid")String Api_key);
}
