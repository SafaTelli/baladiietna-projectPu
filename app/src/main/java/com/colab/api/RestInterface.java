package com.colab.api;





import com.colab.model.LoginResult;
import com.colab.model.Reclamation;
import com.colab.model.User;

import retrofit2.Call;
import retrofit2.http.Body;

import retrofit2.http.Header;

import retrofit2.http.POST;


public interface RestInterface {


    @POST("reclamation")
    Call<Reclamation> postReclamation(@Header("Authorization") String AccessCode, @Body Reclamation reclamation);

    @POST("login")
    Call<LoginResult> login(@Header("Authorization") String AccessCode, @Body User user);

    @POST("reclamation")
    Call<User> signUp(@Header("Authorization") String AccessCode, @Body User user);


}

