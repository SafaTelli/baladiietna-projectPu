package com.colab.api;

import android.content.Context;


import com.colab.utils.Contants;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RestManager {
    private static Retrofit mInstance;
    private static OkHttpClient client;


    public static Retrofit getRetroFit(Context context) {
        if (mInstance == null) {
            HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
            logging.setLevel(HttpLoggingInterceptor.Level.BODY);
            OkHttpClient.Builder okHttpClient = UnsafeOkHttpClient.getUnsafeOkHttpClient().newBuilder()
                    .addInterceptor(logging)
                    .connectTimeout(180, TimeUnit.SECONDS)
                    .readTimeout(180, TimeUnit.SECONDS)
                    .writeTimeout(180, TimeUnit.SECONDS);


           mInstance = new Retrofit.Builder()
                    .client(okHttpClient.build())
                    .baseUrl(Contants.BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

        }
        return mInstance;
    }



}
