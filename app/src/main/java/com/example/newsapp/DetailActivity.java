package com.example.newsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.newsapp.Models.NewsHeadLines;
import com.squareup.picasso.Picasso;

public class DetailActivity extends AppCompatActivity {

    NewsHeadLines headLines;
    TextView txt_title, txt_author, txt_time, txt_detail, txt_content;
    ImageView img_news;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        txt_title = findViewById(R.id.text_detail_title);
        txt_author = findViewById(R.id.text_detail_author);
        txt_time = findViewById(R.id.text_detail_time);
        txt_detail = findViewById(R.id.text_detail_detail);
        txt_content = findViewById(R.id.text_detail_content);
        img_news = findViewById(R.id.img_detail_news);

        headLines = (NewsHeadLines) getIntent().getSerializableExtra("data");

        txt_title.setText(headLines.getTitle());
//        System.out.println(headLines.getTitle());
        txt_author.setText(headLines.getSource());
        txt_time.setText(headLines.getTime());
        txt_detail.setText(headLines.getDescription());
//        System.out.println(headLines.getContent());
        txt_content.setText(headLines.getContent());
        if (!headLines.getPic_url().isEmpty()
                && headLines.getPic_url()!=null){
            Picasso.get().load(headLines.getPic_url()).into(img_news);
        }
    }
}