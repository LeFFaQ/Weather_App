package com.lffq.wapper.network;

import com.lffq.wapper.network.models.current.Current;
import com.lffq.wapper.network.models.onecall.OneCall;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface OpenWeatherApi {

    @GET("/data/2.5/weather")
    public Call<Current> getCurrentFromlatlon(@Query("lat")int lat,
                                              @Query("lon")int lon,
                                              @Query("appid")String Api_key,
                                              @Query("units")String unit,
                                              @Query("lang")String lang);

    @GET("/data/2.5/weather")
    public Call<Current> getCurrentFromName(@Query("q")String city,
                                            @Query("appid")String Api_key,
                                            @Query("units")String unit,
                                            @Query("lang")String lang);

    @GET("/onecall")
    public Call<OneCall> getOneCall(@Query("lat")Double lat,
                                    @Query("lon")Double lon,
                                    @Query("exclude") String exclude,
                                    @Query("appid")String Api_key);
}
