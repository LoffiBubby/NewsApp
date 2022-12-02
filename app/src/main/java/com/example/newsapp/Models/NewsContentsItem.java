package com.example.newsapp.Models;

import java.io.Serializable;

public class NewsContentsItem implements Serializable {
    String content_id = "";
    String news_id = "";
    String content_order = "";
    String url = "";

    public String getContent_id() {
        return content_id;
    }

    public void setContent_id(String content_id) {
        this.content_id = content_id;
    }

    public String getNews_id() {
        return news_id;
    }

    public void setNews_id(String news_id) {
        this.news_id = news_id;
    }

    public String getContent_order() {
        return content_order;
    }

    public void setContent_order(String content_order) {
        this.content_order = content_order;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
