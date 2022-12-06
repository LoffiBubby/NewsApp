package com.example.newsapp;

import com.example.newsapp.Models.InfoDescription;
import com.example.newsapp.Models.NewsApiResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInfo {
    String BASE_URL = "https://zejiachem.com/server/";

    @GET("info/description")
    Call<NewsApiResponse> getInformation();

    @GET("info/contact/address")
    Call<NewsApiResponse> getAddress();

    @GET("info/contact/email")
    Call<NewsApiResponse> getEmail();

    @GET("info/contact/mailno")
    Call<NewsApiResponse> getMailno();
}
