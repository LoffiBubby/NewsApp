package com.example.newsapp.Models;

import androidx.annotation.NonNull;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class NewsHeadLines implements Serializable {
    String title = "";
    String source = "";
    String time = "";
    String url = "";
    String content = "";
    String pic_url = "";
    String description = "";
    List<NewsContentsItem> newsContents;
    List<NewsTexts> newsTexts;
    List<NewsImages> newsImgs;
    @SerializedName("variable_name")
    String variable_name;
    @SerializedName("variable_no")
    String variable_type_no;
    @SerializedName("variable_value")
    String variable_value;

    public String getVariable_name() {
        return variable_name;
    }

    public void setVariable_name(String variable_name) {
        this.variable_name = variable_name;
    }

    public String getVariable_type_no() {
        return variable_type_no;
    }

    public void setVariable_type_no(String variable_type_no) {
        this.variable_type_no = variable_type_no;
    }

    public String getVariable_value() {
        return variable_value;
    }

    public void setVariable_value(String variable_value) {
        this.variable_value = variable_value;
    }

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

    public String getPic_url() {
        return pic_url;
    }

    public void setPic_url(String pic_url) {
        this.pic_url = pic_url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
