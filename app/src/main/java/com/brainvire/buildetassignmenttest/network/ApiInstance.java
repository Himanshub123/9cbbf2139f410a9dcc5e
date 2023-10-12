package com.brainvire.buildetassignmenttest.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiInstance {
    public Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("http://sd2-hiring.herokuapp.com/api/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    public ApiService apiService = retrofit.create(ApiService.class);
}
