package com.example.kmj.sunrinton2018;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;

import retrofit2.http.POST;


public interface API {
    @POST("/earth")
    @FormUrlEncoded
    Call<org.json.simple.JSONObject> earth(@Field("x") String x, @Field("y") String y);

    @POST("/army")
    @FormUrlEncoded
    Call<Data> good(@Field("x") String x, @Field("y") String y);
}
