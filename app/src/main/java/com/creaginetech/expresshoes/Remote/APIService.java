package com.creaginetech.expresshoes.Remote;

import com.creaginetech.expresshoes.Model.MyResponse;
import com.creaginetech.expresshoes.Model.Sender;

import retrofit2.Call;
import retrofit2.http.Body;

public interface APIService {

    Call<MyResponse> sendNotification(@Body Sender body);
}
