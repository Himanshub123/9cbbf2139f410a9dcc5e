package com.brainvire.buildetassignmenttest.network;

import com.brainvire.buildetassignmenttest.model.UserItemModel;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("users?offset=10&limit=10")
    Call<UserItemModel> getUsers();
}
