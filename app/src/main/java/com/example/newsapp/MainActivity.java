package com.example.newsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageSwitcher;
import android.widget.Toast;
import android.widget.ViewSwitcher;

import com.example.newsapp.Models.NewsApiResponse;
import com.example.newsapp.Models.NewsHeadLines;

import java.util.List;

public class MainActivity extends AppCompatActivity implements SelectListener {

    RecyclerView recyclerView;
    CustomAdapter customAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("onCreate");
        RequestManager manager = new RequestManager(this);
        manager.getNewsHeadlines(listener);
    }

    private final OnFetchDataListener<NewsApiResponse> listener = new OnFetchDataListener<NewsApiResponse>() {
        @Override
        public void onFetchData(List<NewsHeadLines> list, String message) {
            showNews(list);
        }

        @Override
        public void onError(String message) {
            System.out.println(message);
        }
    };

    private void showNews(List<NewsHeadLines> list) {
        System.out.println("show news");
        recyclerView = findViewById(R.id.recycler_main);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(this,1));
        customAdapter = new CustomAdapter(this, list,this);

        recyclerView.setAdapter(customAdapter);
    }


    @Override
    public void onNewsClicked(NewsHeadLines headLines) {
        startActivity(new Intent(MainActivity.this, DetailActivity.class)
                .putExtra("data",headLines));
    }
}