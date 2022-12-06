package com.example.newsapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.icu.text.IDNA;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewSwitcher;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.newsapp.Models.InfoDescription;
import com.example.newsapp.Models.NewsApiResponse;
import com.google.android.material.animation.AnimationUtils;

import org.w3c.dom.Text;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class IndexActivity extends AppCompatActivity {

    TextView text_info;

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);


        Button btn_2 = findViewById(R.id.btn_2);

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(IndexActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        Button btn_6 = findViewById(R.id.btn_6);

        btn_6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IndexActivity.this, AboutUs.class);
                startActivity(intent);
            }
        });

        Button btn_1 = findViewById(R.id.btn_1);
        Button btn_3 = findViewById(R.id.btn_3);
        Button btn_4 = findViewById(R.id.btn_4);
        Button btn_5 = findViewById(R.id.btn_5);

        btn_1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IndexActivity.this, DevelopingActivity.class);
                startActivity(intent);
            }
        });

        btn_3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IndexActivity.this, DevelopingActivity.class);
                startActivity(intent);
            }
        });

        btn_4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IndexActivity.this, DevelopingActivity.class);
                startActivity(intent);
            }
        });

        btn_5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IndexActivity.this, DevelopingActivity.class);
                startActivity(intent);
            }
        });

        text_info = findViewById(R.id.description);

        getInformation();
    }

    private void getInformation() {
        Call<NewsApiResponse> call = RetrofitClient1.getInstance().getMyApi().getInformation();
        call.enqueue(new Callback<NewsApiResponse>() {
            @Override
            public void onResponse(@NonNull Call<NewsApiResponse> call, @NonNull Response<NewsApiResponse> response) {
                NewsApiResponse newsApiResponse = response.body();
                assert newsApiResponse != null;
                text_info.setText(newsApiResponse.getData().get(0).getVariable_value());
            }

            @Override
            public void onFailure(@NonNull Call<NewsApiResponse> call, @NonNull Throwable t) {
                Toast.makeText(IndexActivity.this, "An Error Existed", Toast.LENGTH_SHORT).show();
            }
        });
    }
}