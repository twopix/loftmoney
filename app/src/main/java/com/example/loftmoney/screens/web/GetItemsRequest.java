package com.example.loftmoney.screens.web;

import com.example.loftmoney.screens.web.models.GetItemsResponseModel;

import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface GetItemsRequest {
    @GET("./items")
    Single<GetItemsResponseModel> request(@Query("type") String string);
}