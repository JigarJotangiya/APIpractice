package com.example.apipractice;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

public interface APIinterface {

    @GET("players")
    Call<Modelclass> getdata(@Query("page")String page,
                             @Query("per_page")String per_page,
                             @Header("X-RapidAPI-Host")String Host,
                             @Header("X-RapidAPI-Key")String Key);



}
