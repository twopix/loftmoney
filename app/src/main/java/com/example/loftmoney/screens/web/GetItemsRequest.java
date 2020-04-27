package com.example.loftmoney.screens.web;

import com.example.loftmoney.screens.web.models.GetItemsResponseModel;
import com.example.loftmoney.screens.web.models.ItemRemote;

import java.util.List;

import io.reactivex.Completable;
import io.reactivex.Single;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface GetItemsRequest {
    @GET("./items")
    Single<List<ItemRemote>> request(@Query("type") String string,
                                     @Query("auth-token") String authToken);
}