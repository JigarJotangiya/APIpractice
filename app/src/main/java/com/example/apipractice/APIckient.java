package com.example.apipractice;

import com.google.gson.Gson;

import java.net.URL;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class APIckient {

    public static final String URL="https://free-nba.p.rapidapi.com/";

    public static Retrofit retrofit;

    public static Retrofit getApiclient(){

        retrofit = new Retrofit.Builder().baseUrl(URL).addConverterFactory(GsonConverterFactory.create()).build();
        return retrofit;

    }

}
