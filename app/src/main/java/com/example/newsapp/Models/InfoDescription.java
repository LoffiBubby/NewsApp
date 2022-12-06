package com.example.newsapp.Models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class InfoDescription implements Serializable {
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
}
