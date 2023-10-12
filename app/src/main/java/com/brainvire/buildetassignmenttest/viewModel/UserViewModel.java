package com.brainvire.buildetassignmenttest.viewModel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.brainvire.buildetassignmenttest.model.UserItemModel;
import com.brainvire.buildetassignmenttest.network.ApiInstance;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class UserViewModel extends ViewModel {

    public MutableLiveData<UserItemModel> userItemModelMutableLiveData = new MutableLiveData<>();

    public void getUsers() {
        Call<UserItemModel> apiInstance = new ApiInstance().apiService.getUsers();
        apiInstance.enqueue(new Callback<UserItemModel>() {
            @Override
            public void onResponse(Call<UserItemModel> call, Response<UserItemModel> response) {
                userItemModelMutableLiveData.postValue(response.body());
            }

            @Override
            public void onFailure(Call<UserItemModel> call, Throwable t) {

            }
        });
    }
}
