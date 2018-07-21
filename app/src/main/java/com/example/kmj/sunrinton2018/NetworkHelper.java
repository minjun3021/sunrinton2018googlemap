package com.example.kmj.sunrinton2018;


import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class NetworkHelper
{
    final static String url = "http://iwin247.kr";
    final static int port =3030;

    private static Retrofit retrofit;

    public static API getInstance() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(url + ":" + port)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit.create(API.class);
    }

}
