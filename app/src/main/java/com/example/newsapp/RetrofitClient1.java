package com.example.newsapp;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient1 {
    private static RetrofitClient1 instance = null;
    private ApiInfo myApi;

    private RetrofitClient1() {
        Retrofit retrofit = new Retrofit.Builder().baseUrl(ApiInfo.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        myApi = retrofit.create(ApiInfo.class);
    }

    public static synchronized RetrofitClient1 getInstance() {
        if (instance == null) {
            instance = new RetrofitClient1();
        }
        return instance;
    }

    public ApiInfo getMyApi() {
        return myApi;
    }
}
