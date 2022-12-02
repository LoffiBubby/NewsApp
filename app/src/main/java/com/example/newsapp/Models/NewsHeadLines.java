package com.example.newsapp.Models;

import androidx.annotation.NonNull;

import java.io.Serializable;
import java.util.List;

public class NewsHeadLines implements Serializable {
    String title = "";
    String source = "";
    String time = "";
    String url = "";
    String content = "";
    List<NewsContentsItem> newsContents;
    List<NewsTexts> newsTexts;
    List<NewsImages> newsImgs;

    @NonNull
    @Override
    public String toString() {
        return title + "-" + time;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<NewsContentsItem> getNewsContents() {
        return newsContents;
    }

    public void setNewsContents(List<NewsContentsItem> newsContents) {
        this.newsContents = newsContents;
    }

    public List<NewsTexts> getNewsTexts() {
        return newsTexts;
    }

    public void setNewsTexts(List<NewsTexts> newsTexts) {
        this.newsTexts = newsTexts;
    }

    public List<NewsImages> getNewsImgs() {
        return newsImgs;
    }

    public void setNewsImgs(List<NewsImages> newsImgs) {
        this.newsImgs = newsImgs;
    }
}
