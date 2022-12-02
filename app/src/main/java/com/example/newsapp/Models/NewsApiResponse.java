package com.example.newsapp.Models;

import java.io.Serializable;
import java.util.List;

public class NewsApiResponse implements Serializable {
    int code;
    String msg;
    List<NewsHeadLines> data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<NewsHeadLines> getData() {
        return data;
    }

    public void setData(List<NewsHeadLines> data) {
        this.data = data;
    }
}
