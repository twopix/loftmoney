package com.example.loftmoney;


import android.app.Application;

import com.example.loftmoney.screens.web.Api;
import com.example.loftmoney.screens.web.GetItemsRequest;
import com.example.loftmoney.screens.web.PostItemRequest;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class LoftApp extends Application {

    private Retrofit retrofit;

    private Api mApi;

    @Override
    public void onCreate() {
        super.onCreate();

        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://verdant-violet.glitch.me/")
                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttpClient)
                .build();

        mApi = retrofit.create(Api.class);
    }

    public GetItemsRequest getItemsRequest() {
        return retrofit.create(GetItemsRequest.class);
    }

    public PostItemRequest postItemRequest() {
        return retrofit.create(PostItemRequest.class);
    }

    public Api getApi() {
        return mApi;
    }
}