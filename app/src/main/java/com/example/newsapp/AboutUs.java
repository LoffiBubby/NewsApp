package com.example.newsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.example.newsapp.Models.NewsApiResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AboutUs extends AppCompatActivity {
    TextView text_email, text_address, text_postcode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        text_email = findViewById(R.id.txt_email);
        text_address = findViewById(R.id.txt_address);
        text_postcode = findViewById(R.id.txt_postcode);

        getAddress();
        getEmail();
        getPostcode();
    }

    private void getEmail() {
        Call<NewsApiResponse> call = RetrofitClient1.getInstance().getMyApi().getEmail();
        call.enqueue(new Callback<NewsApiResponse>() {
            @Override
            public void onResponse(Call<NewsApiResponse> call, Response<NewsApiResponse> response) {
                NewsApiResponse newsApiResponse = response.body();
                assert newsApiResponse != null;
                text_email.setText(newsApiResponse.getData().get(0).getVariable_value());
            }

            @Override
            public void onFailure(Call<NewsApiResponse> call, Throwable t) {
                Toast.makeText(AboutUs.this, "An Error Existed", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void getPostcode() {
        Call<NewsApiResponse> call = RetrofitClient1.getInstance().getMyApi().getMailno();
        call.enqueue(new Callback<NewsApiResponse>() {
            @Override
            public void onResponse(Call<NewsApiResponse> call, Response<NewsApiResponse> response) {
                NewsApiResponse newsApiResponse = response.body();
                assert newsApiResponse != null;
                text_postcode.setText(newsApiResponse.getData().get(0).getVariable_value());
            }

            @Override
            public void onFailure(Call<NewsApiResponse> call, Throwable t) {
                Toast.makeText(AboutUs.this, "An Error Existed", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void getAddress() {
        Call<NewsApiResponse> call = RetrofitClient1.getInstance().getMyApi().getAddress();
        call.enqueue(new Callback<NewsApiResponse>() {
            @Override
            public void onResponse(Call<NewsApiResponse> call, Response<NewsApiResponse> response) {
                NewsApiResponse newsApiResponse = response.body();
                assert newsApiResponse != null;
                text_address.setText(newsApiResponse.getData().get(0).getVariable_value());
            }

            @Override
            public void onFailure(Call<NewsApiResponse> call, Throwable t) {
                Toast.makeText(AboutUs.this, "An Error Existed", Toast.LENGTH_SHORT).show();
            }
        });

    }
}