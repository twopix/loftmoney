package com.example.loftmoney;


import android.app.Application;

import com.example.loftmoney.screens.web.AuthRequest;
import com.example.loftmoney.screens.web.GetItemsRequest;
import com.example.loftmoney.screens.web.PostItemRequest;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class LoftApp extends Application {

    private Retrofit retrofit;

    @Override
    public void onCreate() {
        super.onCreate();


        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .addInterceptor(interceptor)
                .build();


        retrofit = new Retrofit.Builder()
                .client(okHttpClient)
                .baseUrl(BuildConfig.URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
    }


    public GetItemsRequest getItemsRequest() {return retrofit.create(GetItemsRequest.class);}
    public AuthRequest getAuthRequest() { return retrofit.create(AuthRequest.class); }
    public PostItemRequest postItemRequest() {
        return retrofit.create(PostItemRequest.class);
    }

}